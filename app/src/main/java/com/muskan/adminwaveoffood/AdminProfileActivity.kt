package com.muskan.adminwaveoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muskan.adminwaveoffood.databinding.ActivityAdminProfileBinding

class AdminProfileActivity : AppCompatActivity() {
    private val binding:ActivityAdminProfileBinding by lazy {
        ActivityAdminProfileBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.backButton.setOnClickListener {
          finish()
        }
       binding.name.isEnabled=false
       binding.adress.isEnabled=false
       binding.email.isEnabled=false
       binding.password.isEnabled=false
       binding.phonenumber.isEnabled=false
        var isEnable=false
        binding.EditBuuton.setOnClickListener {
            isEnable =!isEnable
            binding.name.isEnabled=isEnable
            binding.adress.isEnabled=isEnable
            binding.email.isEnabled=isEnable
            binding.password.isEnabled=isEnable
            binding.phonenumber.isEnabled=isEnable
           if (isEnable){
               binding.name.requestFocus()
           }
        }
    }
}