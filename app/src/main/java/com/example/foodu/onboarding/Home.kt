package com.example.foodu.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Home(
    navController: NavController
){
    Column {
        Text(text = "Home Boyz Radio")
    }
}