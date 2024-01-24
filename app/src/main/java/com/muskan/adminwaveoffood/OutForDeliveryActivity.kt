package com.muskan.adminwaveoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.muskan.adminwaveoffood.adapter.DeliveryAdapter
import com.muskan.adminwaveoffood.databinding.ActivityOutForDeliveryBinding

class OutForDeliveryActivity : AppCompatActivity() {
    private val binding:ActivityOutForDeliveryBinding by lazy {
        ActivityOutForDeliveryBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.backButton.setOnClickListener{
            finish()
        }
        val customerName= arrayListOf("Muskan","Anu","Mike Johhnson")
        val moneyStatus= arrayListOf("Received","Pending","Not Received")
        val adapter=DeliveryAdapter(customerName,moneyStatus)
        binding.DeliveryRecyclerView.adapter=adapter
        binding.DeliveryRecyclerView.layoutManager=LinearLayoutManager(this)
    }
}