package com.example.jracademyproject.onboarding.presentation.gamelist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CardSelectionScreen(modifier: Modifier,text:String){
    Row(modifier = Modifier, horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically)
    {
        Text(text = text)
        Icon(modifier = Modifier.clickable {

        }, imageVector = Icons.Default.Check, contentDescription = "")


    }
    }



