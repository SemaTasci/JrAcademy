package com.example.jracademyproject.onboarding.presentation.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import coil.size.Scale
import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.Game
import com.example.jracademyproject.onboarding.presentation.gamelist.GameItem
import com.example.jracademyproject.onboarding.presentation.gamelist.GameListViewModel

@Composable
fun GameDetailScreen(id:Int ,navController: NavController) {
   val gameDetailViewModel = remember { GameDetailViewModel() }
    val detailState by gameDetailViewModel.gameDetailUIState.collectAsState()



//    contentViewModel.getContentById(id)
//    val contents= contentViewModel.contents.value


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

                        Text(text =detailState.game.toString() , fontWeight = FontWeight.Bold)

                    }

                )

                /*Image(
                    painter = rememberImagePainter(contents?.added),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxWidth().height(300.dp)
                )*/


                }

            }

            }

        }





