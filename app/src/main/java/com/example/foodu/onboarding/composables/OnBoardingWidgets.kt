package com.example.foodu.onboarding.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodu.R

@Composable
fun SignInIcon(
    modifier: Modifier = Modifier,
    icon: Int
){
    Card(
        modifier = modifier.clickable {  }
            .background(color = MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(10.dp)
    ){
        Image(
            modifier = modifier.padding(16.dp)
                .size(40.dp),
            painter = painterResource(id = icon),
            contentDescription = "SignIn Icon"
        )
    }
}

@Composable
@Preview(showBackground = true)
fun SignInIconPreview(){
    SignInIcon(icon = R.drawable.facebook_icon)
}