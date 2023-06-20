package com.example.jracademyproject.onboarding.presentation.gamelist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import coil.size.Scale
import com.example.jracademyproject.navigation.Screens

@Composable
fun GameItem(result:com.example.jracademyproject.onboarding.domain.model.resultdataclasses.Result,
navController: NavController) {

    val rmnavcontroller= rememberNavController()
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 375.dp, height = 136.dp)
                .background(color = Color.White)
                .padding(all = 20.dp)
                .clickable {
                    rmnavcontroller.navigate(Screens.Detail.route + "/${result.id}")

                }
        )
        {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 150.dp)
                    .size(width = 10.dp, height = 10.dp)
            )
            {
                val imagePainter = rememberImagePainter(
                    data = result.image_background,
                    builder = {
                        scale(Scale.FILL)
                    }
                )

                Image(
                    modifier = Modifier.size(width = 150.dp, height = 120.dp),
                    painter = imagePainter,
                    contentDescription = result.year_end.toString(),
                    contentScale = ContentScale.FillBounds
                )

            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 150.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {

                Text(
                    text = result.name,
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Bold,
                    color = Color.Unspecified
                )
                Spacer(modifier = Modifier.padding(12.dp))

                /*Text(
                    text = result.year_start.toString(),
                    style = MaterialTheme.typography.body2,
                    fontWeight = FontWeight.W300,
                    color = Color.Black
                )
                Text(
                    text = result.slug,
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Bold,
                    color = Color.Unspecified
                )*/

                LazyRow {
                    item {
                       Text(text = "metacritic:", textAlign = TextAlign.Center, fontWeight = FontWeight.W900,
                           modifier = Modifier.padding(top = 12.dp))
                        Spacer(modifier = Modifier.padding(10.dp))
                        Text(
                            text = result.games_count.toString()
                            , modifier = Modifier.padding(top = 8.dp),
                            style = MaterialTheme.typography.subtitle1,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )
                    }
                }
            }
        }
        }
    }

        /*Row(modifier = Modifier
                        .padding(horizontal = 15.dp, vertical = 16.dp),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.End)
                    {
                        Icon(imageVector = Icons.Default.Delete,
                        contentDescription = "")
                    }*/






