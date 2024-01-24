package com.muskan.adminwaveoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import com.muskan.adminwaveoffood.databinding.ActivityAddItemBinding

class AddItemActivity : AppCompatActivity() {
    private val binding:ActivityAddItemBinding by lazy {
        ActivityAddItemBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.SelectImage.setOnClickListener {
            pickImage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }
binding.backButton.setOnClickListener {
    val intent=Intent(this,MainActivity::class.java)
    startActivity(intent)
}
    }
    val pickImage=registerForActivityResult(ActivityResultContracts.PickVisualMedia()){ uri->
        if(uri!=null){
            binding.addImage.setImageURI(uri)
        }
    }
}