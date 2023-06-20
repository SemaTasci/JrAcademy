import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.jracademyproject.R
import com.example.jracademyproject.navigation.JrAcademyNavigationItem
import com.example.jracademyproject.onboarding.presentation.favorites.FavoriteListScreen
import com.example.jracademyproject.ui.rememberJrAcademyAppState

@Composable
fun App() {
    val appState = rememberJrAcademyAppState()
    val isFavoriteSelected = remember { mutableStateOf(false) }
    val isGameSelected= remember {
        mutableStateOf(true)
    }


    Scaffold(
        topBar = {
            if (isFavoriteSelected.value) {
                TopAppBar(
                    title = {
                        Text(
                            text = stringResource(id = R.string.icon_name_favorite),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 60.dp),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.W300,
                            fontSize = 30.sp,
                            color = Color.White
                        )

                    },
                    navigationIcon = {
                        IconButton(onClick = { isFavoriteSelected.value = false }) {

                        }
                    },
                    backgroundColor = MaterialTheme.colors.primary
                )
            } else if (isGameSelected.value) {

                TopAppBar(
                    title = {
                        Text(
                            text = stringResource(id = R.string.icon_name_games),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 60.dp),
                            textAlign=TextAlign.Center,
                            fontWeight = FontWeight.W300,
                            fontSize = 30.sp,
                            color = Color.White
                        )
                    },
                    navigationIcon={
                        IconButton(onClick = {isGameSelected.value=true}) {
                            
                        }
                    },
                    backgroundColor = MaterialTheme.colors.primary
                )
            }
        },
        bottomBar = {
            AppBottomNavigationBar(appState.navController, isFavoriteSelected,isGameSelected)

        }
    ) {
        Column(
            modifier = Modifier.padding(bottom = it.calculateBottomPadding())
        ) {
            if (isFavoriteSelected.value) {
                FavoriteListScreen()
            } else {
                GameListScreen(appState.navController)
                //(JrAcademyNavigationItem.DashboardScreen.screenRoute)


            }
        }
    }
}



@Composable
private fun AppBottomNavigationBar(navController: NavController, isFavoriteSelected: MutableState<Boolean>, isGameSelected:MutableState<Boolean>) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomAppBar(
        elevation = 8.dp,
        backgroundColor = Color.White
    ) {
        val bottomNavItems = listOf(
            JrAcademyNavigationItem.GameListScreen,
            JrAcademyNavigationItem.FavoritesScreen,
        )

        bottomNavItems.forEach { item ->
            BottomNavigationItem(
                selected = currentRoute == item.screenRoute,
                onClick = {
                    if (item == JrAcademyNavigationItem.FavoritesScreen) {
                        isFavoriteSelected.value = true
                    } else if (item==JrAcademyNavigationItem.GameListScreen){
                    }

                    else {
                        isFavoriteSelected.value = false
                        navController.navigate(item.screenRoute) {
                            navController.graph.startDestinationRoute?.let { screenRoute ->
                                popUpTo(screenRoute) {
                                    saveState = true
                                }
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(
                            id = item.bottomNavigationIcon ?: R.drawable.ic_games
                        ),
                        contentDescription = ""
                    )

                },
                label = {
                    if (true && item.iconName != R.string.icon_name_games) {
                        Text(text = stringResource(id = R.string.icon_name_favorite))
                    } else {
                        Text(text = stringResource(id = item.pageTitle ?: R.string.icon_name_games))
                    }

                },
                alwaysShowLabel = true,
                selectedContentColor = MaterialTheme.colors.primary,
            )
        }
    }
}
