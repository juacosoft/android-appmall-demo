package com.hackaton.appmall.presentacion.ui.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hackaton.appmall.R
import com.hackaton.appmall.databinding.ActivityCreateAppBinding
import com.hackaton.appmall.presentacion.ui.createapp.startstep.view.CreateAppActivity

class MainActivity : AppCompatActivity() {

    private val binding: ActivityCreateAppBinding by lazy {
        ActivityCreateAppBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // TODO call activity temporal
        startActivity(CreateAppActivity.createIntent(this))
    }
}