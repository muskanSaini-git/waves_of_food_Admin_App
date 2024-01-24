package com.muskan.adminwaveoffood.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muskan.adminwaveoffood.databinding.ItemItemBinding

class AddtemAdapter (private val MenuItemName:ArrayList<String>, private val MenuItemPrice: ArrayList<String>, private val MenuItemImage: ArrayList<Int>):RecyclerView.Adapter<AddtemAdapter.AddItemViewHolder>(){

    private val itemQuantites = IntArray(MenuItemName.size) { 1 }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddItemViewHolder {
       val binding=ItemItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AddItemViewHolder(binding)
    }



    override fun onBindViewHolder(holder: AddItemViewHolder, position: Int) {
       holder.bind(position)
    }
    override fun getItemCount(): Int =MenuItemName.size
    inner class AddItemViewHolder(private val binding:ItemItemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
          binding.apply {
              val quantity = itemQuantites[position]
              foodname.text=MenuItemName[position]
              foodprice.text=MenuItemPrice[position]
              cartimage.setImageResource(MenuItemImage[position])
              cartitemquantity.text = quantity.toString()
              minusButton.setOnClickListener {
                  decreasaQuantites(position)

              }
              plusButton.setOnClickListener {
                  increaseQuantites(position)

              }
              deletebutton.setOnClickListener {
                  val itemPosition =adapterPosition
                  if (itemPosition!=RecyclerView.NO_POSITION){
                      deleteItem(itemPosition)
                  }
              }
          }
        }

        private fun decreasaQuantites(position: Int) {
            if (itemQuantites[position] > 1) {
                itemQuantites[position]--
                binding.cartitemquantity.text = itemQuantites[position].toString()
            }

        }

        private fun increaseQuantites(position: Int) {
            if (itemQuantites[position] < 18) {
                itemQuantites[position]++
                binding.cartitemquantity.text = itemQuantites[position].toString()
            }
        }

        private fun deleteItem(position: Int) {
            MenuItemName.removeAt(position)
            MenuItemImage.removeAt(position)
          MenuItemPrice.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, MenuItemName.size)


        }
          }
        }
