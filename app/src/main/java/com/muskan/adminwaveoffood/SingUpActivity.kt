package com.muskan.adminwaveoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.muskan.adminwaveoffood.databinding.ActivitySingUpBinding

class SingUpActivity : AppCompatActivity() {
    private val binding:ActivitySingUpBinding by lazy {
        ActivitySingUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.createaccout.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.alreadyhavebutton.setOnClickListener {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        val locationList= arrayOf("Jaipur","Odisha","Bundi","Sikar")
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView=binding.listofLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}