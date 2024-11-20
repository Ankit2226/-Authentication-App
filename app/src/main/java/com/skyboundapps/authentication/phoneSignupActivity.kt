package com.skyboundapps.authentication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.skyboundapps.authentication.databinding.ActivityPhoneSignupBinding
import com.skyboundapps.authentication.databinding.ActivitySignupBinding

class phoneSignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPhoneSignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPhoneSignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}