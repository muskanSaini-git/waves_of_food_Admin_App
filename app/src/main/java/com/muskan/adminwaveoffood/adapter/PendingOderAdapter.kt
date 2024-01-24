package com.muskan.adminwaveoffood.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.muskan.adminwaveoffood.databinding.PendingOrderItemsBinding

class PendingOderAdapter(private val customerName:ArrayList<String>,private val quantityNumber:ArrayList<String>,private val foodImage:ArrayList<Int>,private val context: Context):RecyclerView.Adapter<PendingOderAdapter.PendingOrderViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PendingOrderViewHolder {
        val binding=PendingOrderItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PendingOrderViewHolder(binding)
    }



    override fun onBindViewHolder(holder: PendingOrderViewHolder, position: Int) {
       holder.bind(position)
    }
    override fun getItemCount(): Int=customerName.size
    inner  class PendingOrderViewHolder(private val binding: PendingOrderItemsBinding):RecyclerView.ViewHolder(binding.root) {
        private var isAccepted=false
        fun bind(position: Int) {
binding.apply {
    CustomerName.text=customerName[position]
    quantity.text=quantityNumber[position]
    orderFoodImage.setImageResource(foodImage[position])
    Accept.apply {
        if (isAccepted){
            text="Accept"
        }else{
            text="Dispatch"
        }
        setOnClickListener {
if (!isAccepted){
    text="Dispatch"
    isAccepted=true
    showToast("Order is Accepted")

}else{
    customerName.removeAt(adapterPosition)
    notifyItemRemoved(adapterPosition)
    showToast("Oder is Dispatch")

}
        }
    }
}

        }
      private  fun showToast(message:String){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }


    }
}