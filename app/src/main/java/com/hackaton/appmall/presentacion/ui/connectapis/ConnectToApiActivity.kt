package com.hackaton.appmall.presentacion.ui.connectapis

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hackaton.appmall.R
import com.hackaton.appmall.databinding.ActivityConnectToApiBinding

class ConnectToApiActivity : AppCompatActivity() {

    private val binding: ActivityConnectToApiBinding by lazy {
        ActivityConnectToApiBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.topAppBarCreateApp.setNavigationOnClickListener {
            finish()
        }
    }
    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, ConnectToApiActivity::class.java)
        }
    }
}