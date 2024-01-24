package com.muskan.adminwaveoffood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.muskan.adminwaveoffood.adapter.PendingOderAdapter
import com.muskan.adminwaveoffood.databinding.ActivityPendingOrderBinding

class PendingOrderActivity : AppCompatActivity() {
    private val binding:ActivityPendingOrderBinding by lazy {
        ActivityPendingOrderBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.backButton.setOnClickListener {
            finish()
        }
        val customerName= arrayListOf("Muskan","Anu","Mike Johhnson")
        val quantity= arrayListOf("8","6","3")
        val orderImage= arrayListOf(R.drawable.menu1,R.drawable.menu5,R.drawable.menu4)
        val adapter= PendingOderAdapter(customerName,quantity,orderImage,this)
        binding.pendingOrderRecycler.adapter=adapter
        binding.pendingOrderRecycler.layoutManager= LinearLayoutManager(this)
    }
    }
