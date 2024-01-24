package com.muskan.adminwaveoffood.adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muskan.adminwaveoffood.databinding.DeliveryItemBinding

class DeliveryAdapter(private val CustomerName:ArrayList<String>,private val moneyStatus:ArrayList<String>):RecyclerView.Adapter<DeliveryAdapter.DeliveryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeliveryViewHolder {
       val binding=DeliveryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DeliveryViewHolder(binding)
    }



    override fun onBindViewHolder(holder: DeliveryViewHolder, position: Int) {
        holder.bind(position)
    }
    override fun getItemCount(): Int =CustomerName.size
    inner class DeliveryViewHolder(private val binding:DeliveryItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply {
            customerName.text=CustomerName[position]
                paymentStatus.text=moneyStatus[position]
                val colorMap= mapOf(
                    "Received" to Color.GREEN,"Not Received" to Color.RED,"Panding" to Color.GRAY
                )
                paymentStatus.setTextColor(colorMap[moneyStatus[position]]?:Color.BLACK)
                StatusColor.backgroundTintList= ColorStateList.valueOf(colorMap[moneyStatus[position]]?:Color.BLACK)
            }
        }

    }
}