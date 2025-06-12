package com.example.tasklist.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.airbnb.lottie.LottieAnimationView
import com.example.tasklist.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottieAnimation = findViewById<LottieAnimationView>(R.id.view)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        Handler(Looper.getMainLooper()).postDelayed({
            lottieAnimation.visibility = View.GONE
            navController.navigate(R.id.loginFragment) // Navegar a LoginFragment después del cargador
        }, 3000)
    }
}

