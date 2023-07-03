package com.example.jracademyproject

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier

import androidx.navigation.compose.rememberNavController


import com.example.jracademyproject.ui.theme.JrAcademyProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JrAcademyProjectTheme {
                val navController= rememberNavController()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    App(navController)
                    /*val navController= rememberNavController()
                 JRAcademyNavigation(modifier = Modifier, navController = navController, contentViewModel = viewModel() )*/
                }
            }
        }
    }
}

