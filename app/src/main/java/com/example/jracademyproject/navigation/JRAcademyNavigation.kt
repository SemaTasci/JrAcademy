package com.example.jracademyproject.navigation

import GameListScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jracademyproject.onboarding.presentation.content.GameDetailScreen

import com.example.jracademyproject.util.Constants.Screens.CONTENT_SCREEN
import com.example.jracademyproject.util.Constants.Screens.GAME_LIST_SCREEN

@Composable
fun JRAcademyNavigation(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Screens.GameListScreen.route
    ) {
  /*composable(
            route = JrAcademyNavigationItem.ContentScreen.screenRoute+ "/{$KEY_GAME_ID}") { backStackEntry ->
                ContentScreen(id = backStackEntry.arguments?.getString(KEY_GAME_ID)?: "1", contentViewModel =contentViewModel , navController = navController)
            }*/
        /*"{id}",
        result.id.toString()*/
        composable(route = Screens.GameListScreen.route) {
            GameListScreen(navController)
        }
//backStackEntry.arguments?.getInt(KEY_GAME_ID)?:    /{$KEY_GAME_ID}"
        composable(route = "content_screen/{gameId}",
            arguments = listOf(navArgument("gameId"){type = NavType.StringType})
        ) { backStackEntry ->
            GameDetailScreen(
                id = (backStackEntry.arguments?.getString("gameId")?:"0").toInt(),
                navController = navController
            )
        }
    }
}

/*{
    GameListScreen(navController = navController, result = result)
}*/
sealed class Screens(val route: String) {

    object GameListScreen : Screens(route = GAME_LIST_SCREEN)
    object Detail : Screens(route = CONTENT_SCREEN)

}
