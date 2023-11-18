package com.example.foodu.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.foodu.extras.FooduRoutes

@Composable
fun VerificationPage(
    modifier: Modifier = Modifier,
    navController: NavController,
){
    Column {
        Text(text = "Code has been sent to +254741564020")
        Text(text = "OTP code number")
        Text(text = "Resend in 55 seconds")
        Button(
            modifier = modifier.fillMaxWidth(),
            onClick = {
                navController.navigate(FooduRoutes.HAHA)
            }
        ) {
            Text(text = "Verify")
        }
    }
}