package com.example.jracademyproject.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun rememberJrAcademyAppState(
    navController: NavHostController = rememberNavController()
) =
    remember(navController) {
        JrAcademyProjectAppState(navController)
    }

/**
 * Responsible for holding state related to [JetsnackApp] and containing UI-related logic.
 */
@Stable
class JrAcademyProjectAppState(
    val navController: NavHostController
)