package com.hackaton.appmall.presentacion.ui.createapp.startstep.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.hackaton.appmall.R
import com.hackaton.appmall.databinding.ActivityCreateAppBinding
import com.hackaton.appmall.presentacion.ui.createapp.CreateAppViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateAppActivity : AppCompatActivity() {

    private val viewModel: CreateAppViewModel by viewModels()

    private val binding: ActivityCreateAppBinding by lazy {
        ActivityCreateAppBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostContainer) as NavHostFragment
        val navController = navHostFragment.navController
    }

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, CreateAppActivity::class.java)
        }
    }
}