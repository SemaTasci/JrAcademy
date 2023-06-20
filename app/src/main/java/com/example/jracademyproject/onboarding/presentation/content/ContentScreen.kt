package com.example.jracademyproject.onboarding.presentation.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.jracademyproject.navigation.JrAcademyNavigationItem
@Composable
fun ContentScreen(id:Int,contentViewModel: ContentViewModel,navController: NavController) {
    contentViewModel.getContentById(id)
    val contents= contentViewModel.contents.value


    LazyColumn{

        item {

            Column {

                TopAppBar(

                    navigationIcon = {

                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                        }

                    },

                    title = {

                        Text(text = contents?.name?:"" , fontWeight = FontWeight.Bold)

                    }

                )

                /*Image(
                    painter = rememberImagePainter(contents?.added),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxWidth().height(300.dp)
                )*/

                Text(text = contents?.name ?: "", modifier = Modifier.padding(10.dp))

            }

        }

    }


}
