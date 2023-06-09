package com.hackaton.appmall.presentacion.ui.home.view

import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import com.hackaton.appmall.R
import com.hackaton.appmall.databinding.ActivityMainBinding
import com.hackaton.appmall.presentacion.ui.createapp.startstep.view.CreateAppActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // TODO call activity temporal
        binding.topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.person -> {
                    // Handle favorite icon press
                    true
                }
                R.id.menu -> {
                    val menuItemView = findViewById<View>(R.id.menu)
                    showPopupMenu(menuItemView)
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun showPopupMenu(anchor: View) {
        val popupMenu = PopupMenu(this, anchor)
        popupMenu.inflate(R.menu.menu_hamburgesa_home)
        popupMenu.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.menu_home_createapp -> {
                    startActivity(CreateAppActivity.createIntent(this))
                    true
                }
                else -> {
                    false
                }
            }
        }
        popupMenu.show()

    }
}