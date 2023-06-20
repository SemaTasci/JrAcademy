/*package com.example.jracademyproject.di

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.jracademyproject.onboarding.presentation.gamelist.GameListViewModel

@Composable
fun favoritetwoscreen(gameListViewModel: GameListViewModel){
    val favoriteGames=gameListViewModel.gamesUIState
 if (favoriteGames.is)
@Composable
fun FavoriteGameItem (favoriteDataClass:FavoriteDataClass){
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(136.dp)
        .padding(all = 20.dp)) {
        Column(modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center) {
            Text(text = favoriteDataClass.name,
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Bold)

        }

    }

}
*/
