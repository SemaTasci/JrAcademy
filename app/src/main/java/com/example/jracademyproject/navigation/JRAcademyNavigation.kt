package com.example.jracademyproject.navigation

import App
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jracademyproject.onboarding.domain.model.resultdataclasses.Result
import com.example.jracademyproject.onboarding.presentation.content.ContentScreen
import com.example.jracademyproject.onboarding.presentation.content.ContentViewModel
import com.example.jracademyproject.onboarding.presentation.content.contentList
import com.example.jracademyproject.onboarding.presentation.gamelist.GameListScreen
import com.example.jracademyproject.util.Constants
import com.example.jracademyproject.util.Constants.Companion.KEY_GAME_ID
import com.example.jracademyproject.util.Constants.Screens.CONTENT_SCREEN
import com.example.jracademyproject.util.Constants.Screens.GAMELİST_SCREEN

@Composable
fun JRAcademyNavigation(
    modifier: Modifier,
    navController: NavHostController,
    contentViewModel: ContentViewModel

) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = JrAcademyNavigationItem.GameListScreen.screenRoute
    ) {
        //TODO : Buraya composable screenler gelecek...

        /*composable(
            route = JrAcademyNavigationItem.ContentScreen.screenRoute+ "/{$KEY_GAME_ID}") { backStackEntry ->
                ContentScreen(id = backStackEntry.arguments?.getString(KEY_GAME_ID)?: "1", contentViewModel =contentViewModel , navController = navController)
            }*/
                /*"{id}",
                result.id.toString()*/
        composable(route=Screens.GameListScreen.route){
        App()
        }
//backStackEntry.arguments?.getInt(KEY_GAME_ID)?:    /{$KEY_GAME_ID}"
        composable(route = Screens.Detail.route ) { backStackEntry ->
            ContentScreen(id =4, contentViewModel = contentViewModel, navController = navController)
        }
    }
}
/*{
    GameListScreen(navController = navController, result = result)
}*/
sealed class Screens (val route: String){

    object GameListScreen: Screens(route = GAMELİST_SCREEN)
    object Detail: Screens(route = CONTENT_SCREEN)

}
