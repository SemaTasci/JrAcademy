import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jracademyproject.onboarding.presentation.gamelist.GameItem
import com.example.jracademyproject.onboarding.presentation.gamelist.GameListViewModel
import com.example.jracademyproject.ui.components.SearchView

@Composable
fun GameListScreen(navController: NavController) {
    val textState = remember { mutableStateOf(TextFieldValue("")) }
    SearchView(textState)
    Spacer(modifier = Modifier.padding(2.dp))
    val gameViewModel = remember { GameListViewModel() }
    val state by gameViewModel.gamesUIState.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        if (state.results.isEmpty()) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .fillMaxWidth()
                    .size(width = 244.dp, height = 41.dp)
            ) {
                Text(
                    text = "No game has been searched.",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Default // Roboto
                )
            }
        } else {

            LazyColumn {
                itemsIndexed(items = state.results) { index, item ->

                   /* val navController = rememberNavController()
                    JRAcademyNavigation(navController = navController, contentViewModel = viewModel(),
                    modifier = Modifier, startDestination = JrAcademyNavigationItem.GameListScreen.screenRoute
                    )*/
                    GameItem(result = item, navController = navController)

                    /*CardSelectionScreen(modifier = Modifier.clickable {
                       Log.d("",""+item.id)
                       navController.navigate(
                           JrAcademyNavigationItem.ContentScreen.screenRoute.replace(
                               "{id}",
                               item.id.toString()
                           )
                       )
                    }, text = "")*/



                }
            }
        }
    }
}
