package com.example.foodu.onboarding.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodu.R

@Composable
fun SignInIcon(
    modifier: Modifier = Modifier,
    icon: DrawableRes
){
    Card(
        modifier = modifier.clickable {  }
    ){
        Image(
            modifier = modifier.padding(10.dp),
            painter = painterResource(id = ),
            contentDescription = "SignIn Icon"
        )
    }
}