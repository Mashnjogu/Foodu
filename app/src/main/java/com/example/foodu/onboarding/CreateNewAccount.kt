package com.example.foodu.onboarding

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.foodu.R

@Composable
fun CreateNewAccount(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.padding(8.dp)
    ){
        Image(
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .fillMaxHeight(0.2f)
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.foodu_logo),
            contentDescription = "Welcome image"
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = modifier.align(Alignment.CenterHorizontally),
            text = "Create New Account"
        )
        Spacer(modifier = Modifier.height(4.dp))
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
//        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            label = {
                    Text(text = "Email")
            },
            value = "",
            onValueChange = {},
            modifier = modifier
                .padding(8.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.None,
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Email,
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_email_24),
                    contentDescription = "Email icon")
            }
        )
//        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            label = {
                    Text(text = "Full Name")
            },
            value = "",
            onValueChange = {},
            modifier = modifier
                .padding(8.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.None,
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Text,
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_person_24),
                    contentDescription = "User icon"
                )
            }
        )
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            modifier = modifier.align(Alignment.CenterHorizontally)
        ){
                Checkbox(checked = false, onCheckedChange = {})
                Text(
                    text = "Remember me",
                    modifier = modifier.align(Alignment.CenterVertically)
                )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Button(
            modifier = modifier.fillMaxWidth(),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Sign Up")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Or continue with",
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row {
//            ImageButton()
        }
        Text(text = "List of options")
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Already have an account? Sign in",
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
    }

}


