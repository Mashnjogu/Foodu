package com.example.foodu.onboarding

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.foodu.R
import com.example.foodu.extras.FooduRoutes
import com.example.foodu.onboarding.signin.googlesignin.AuthViewModel

@Composable
fun SignInPage(
    navController: NavController,
    viewModel: AuthViewModel = hiltViewModel(),
    navigateToProfileScreen: () -> Unit
){


    Column(
        modifier = Modifier.padding(horizontal =12.dp)
    ){
        Image(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .fillMaxHeight(0.4f)
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.welcome),
            contentDescription = "Welcome image"
        )
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Let's get you in"
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ }) {
            Text(text = "Continue with Facebook")
        }
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = {

            }) {
            Text(text = "Continue with Google")
        }
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ }) {
            Text(text = "Continue with Yahoo")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "or"
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                navController.navigate(FooduRoutes.LOGIN)
            }) {
            Text("Sign In with Phone Number")
        }
        Spacer(modifier = Modifier.height(12.dp))
        TextButton(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {
                navController.navigate(FooduRoutes.CREATENEWACCOUNT)
            }) {
            Text(text = "Don't have an account? Sign Up")
        }

    }

}