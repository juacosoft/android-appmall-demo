package com.hackaton.appmall.presentacion.ui.selecttemplate.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hackaton.appmall.R
import com.hackaton.appmall.databinding.ActivitySelectTemplateBinding
import com.hackaton.appmall.presentacion.ui.connectapis.ConnectToApiActivity

class SelectTemplateActivity : AppCompatActivity() {
    private val binding: ActivitySelectTemplateBinding by lazy {
        ActivitySelectTemplateBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.topAppBarCreateApp.setNavigationOnClickListener {
            finish()
        }
        binding.btnAddService.setOnClickListener {
            startActivity(ConnectToApiActivity.createIntent(this))
        }
    }

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, SelectTemplateActivity::class.java)
        }
    }
}