package com.muskan.adminwaveoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muskan.adminwaveoffood.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
   binding.addMenu.setOnClickListener{
   val intent=Intent(this,AddItemActivity::class.java)
   startActivity(intent)
   }
        binding.AllItem.setOnClickListener{
            val intent=Intent(this,AllItemActivity::class.java)
            startActivity(intent)
        }
        binding.OrderDispatch.setOnClickListener{
            val intent=Intent(this,OutForDeliveryActivity::class.java)
            startActivity(intent)
        }
        binding.profile.setOnClickListener{
            val intent=Intent(this,AdminProfileActivity::class.java)
            startActivity(intent)
        }
        binding.CreateNewUser.setOnClickListener {
            val intent=Intent(this,CreateUserActivity::class.java)
            startActivity(intent)
        }
        binding.pendingOrderText.setOnClickListener {
            val intent=Intent(this,PendingOrderActivity::class.java)
            startActivity(intent)
        }
        }

    }
