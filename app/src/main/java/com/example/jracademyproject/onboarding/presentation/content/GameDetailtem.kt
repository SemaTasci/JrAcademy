/*package com.example.jracademyproject.onboarding.presentation.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.size.Scale


@Composable
fun GameDetailItem(
    contentDataClass: ContentDataClass,
) {
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 375.dp, height = 136.dp)
                .background(color = Color.White)
                .padding(all = 20.dp)

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
                    data = contentDataClass.image_background,
                    builder = {
                        scale(Scale.FILL)
                    }
                )

                Image(
                    modifier = Modifier.size(width = 150.dp, height = 120.dp),
                    painter = imagePainter,
                    contentDescription = contentDataClass.slug,
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
                    text = contentDataClass.name,
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

            }
        }
    }
}*/
