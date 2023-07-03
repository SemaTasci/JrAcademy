package com.example.jracademyproject.navigation
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.jracademyproject.util.Constants


object JRAcademyDestinations{
    const val GAME_LIST_SCREEN="game_list_screen"
    const val GAME_DETAIL_SCREEN= "game_detail_screen"
}

class JRAcademyNavigationActions(navHostController: NavHostController) {

    val navigateToGameList:() -> Unit = {
        navHostController.navigate(JRAcademyDestinations.GAME_LIST_SCREEN) {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }
    val navigateToGameDetail: (gameId: Int) -> Unit = {
        navHostController.navigate(JRAcademyDestinations.GAME_DETAIL_SCREEN,
        ) {
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

}