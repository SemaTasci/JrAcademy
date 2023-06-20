package com.example.jracademyproject.onboarding.presentation.favorites

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FavoriteListScreen()
{
    LazyColumn {
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(width = 375.dp, height = 136.dp)
                    .background(color = Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    /*Image(modifier = Modifier
                        .fillMaxHeight(),
                        painter = rememberImagePainter(data = game.slug,
                            builder = {
                                scale(Scale.FILL)
                                placeholder(com.example.jracademyproject.R.drawable.ic_launcher_background)
                            }), contentDescription = game.name
                    )*/

                }
            }
        }
    }

}