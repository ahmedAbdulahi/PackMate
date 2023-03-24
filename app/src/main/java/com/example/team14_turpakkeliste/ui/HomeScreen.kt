package com.example.team14_turpakkeliste.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.team14_turpakkeliste.BottomNavBar
import com.example.team14_turpakkeliste.MapScreen
import com.example.team14_turpakkeliste.ui.theme.Team14TurPakkeListeTheme

@Composable
fun HomeScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
    ){

    }
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ){
        BottomNavBar()
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Team14TurPakkeListeTheme {
        HomeScreen()
    }
}