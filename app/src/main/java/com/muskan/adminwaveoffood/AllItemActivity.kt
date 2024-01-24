package com.muskan.adminwaveoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.muskan.adminwaveoffood.adapter.AddtemAdapter
import com.muskan.adminwaveoffood.databinding.ActivityAllItemBinding

class AllItemActivity : AppCompatActivity() {
    private val binding:ActivityAllItemBinding by lazy {
        ActivityAllItemBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
           val menuFoodName= listOf("Burger","Sandwich","Momo","Item","Burger","Sandwich","Momo","Item")
        val MenuItemPrice= listOf("$5","$8","$6","$10","$5","$8","$6","$10")
        val menuImage= listOf(R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu2,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu1,)
        binding.backButton.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    val adapter=AddtemAdapter(ArrayList(menuFoodName),ArrayList(MenuItemPrice),ArrayList(menuImage))
        binding.MenuRecyclerView.layoutManager=LinearLayoutManager(this)
        binding.MenuRecyclerView.adapter=adapter

    }


}

