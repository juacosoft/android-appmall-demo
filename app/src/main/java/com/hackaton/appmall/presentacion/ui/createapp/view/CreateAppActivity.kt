package com.hackaton.appmall.presentacion.ui.createapp.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hackaton.appmall.R
import com.hackaton.appmall.databinding.ActivityCreateAppBinding

class CreateAppActivity : AppCompatActivity() {

    private val binding: ActivityCreateAppBinding by lazy {
        ActivityCreateAppBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, CreateAppActivity::class.java)
        }
    }
}