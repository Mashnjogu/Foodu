package com.example.foodu.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.foodu.R
import com.example.foodu.extras.FooduRoutes
import com.example.foodu.onboarding.composables.SignInIcon

@Composable
fun LoginPage(
    modifier: Modifier = Modifier,
    navController: NavController,
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
            modifier = modifier.align(Alignment.CenterHorizontally),
            text = "Login to your Account"
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            label = { Text(text = "0700000000")},
            value = "",
            onValueChange = {},
            modifier = modifier
                .padding(8.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.None,
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Number,
            ),
            leadingIcon = {

            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = modifier.align(Alignment.CenterHorizontally)
        ){
            Checkbox(
                checked = false,
                onCheckedChange = {}
            )
            Text(
                text = "Remember me",
                modifier = modifier.align(Alignment.CenterVertically)
            )
        }
        Button(
            modifier = modifier.fillMaxWidth(),
            onClick = {
                navController.navigate(FooduRoutes.VERIFICATION)
            }
        ) {
            Text(text = "Sign In")
        }
        Text(
            text = "Or continue with",
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            SignInIcon(icon = R.drawable.facebook_icon)
            Spacer(modifier = Modifier.width(12.dp))
            SignInIcon(icon = R.drawable.google_icon)
            Spacer(modifier = Modifier.width(12.dp))
            SignInIcon(icon = R.drawable.gmail_icon)
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = buildAnnotatedString {
                append("Don't have an account? ")
                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colorScheme.primary
                    )
                ){
                    append("Sign up")
                }
            }
            ,
            modifier = modifier.align(Alignment.CenterHorizontally).clickable {
                navController.navigate(FooduRoutes.CREATENEWACCOUNT)
            }
        )
    }
}