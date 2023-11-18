package com.example.foodu

import android.app.Activity.RESULT_OK
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.foodu.extras.FooduRoutes
import com.example.foodu.homescreens.Haha
import com.example.foodu.onboarding.CreateNewAccount
import com.example.foodu.onboarding.Home
import com.example.foodu.onboarding.SignInPage
import com.example.foodu.onboarding.WelcomeScreen
import com.example.foodu.onboarding.LoginPage
import com.example.foodu.onboarding.VerificationPage
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.android.gms.auth.api.identity.Identity
import kotlinx.coroutines.launch


@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
@Composable
fun MainScreenNavigationComponents(
    startDestination: String,
    navHostController: NavHostController,
    input: ActivityResultContracts.StartIntentSenderForResult
){


    NavHost(navController = navHostController, startDestination = startDestination){
        composable(FooduRoutes.WELCOME){
            WelcomeScreen(navHostController)
        }

        composable(FooduRoutes.SIGNIN){
            SignInPage(
                navHostController,
                viewModel = ,
                navigateToProfileScreen = {}
            )
        }

        composable(FooduRoutes.HOME){
            Home(navHostController)
        }
        composable(FooduRoutes.CREATENEWACCOUNT){
            CreateNewAccount(navHostController)
        }
        composable(FooduRoutes.LOGIN){
            LoginPage(navController = navHostController)
        }
        composable(FooduRoutes.VERIFICATION){
            VerificationPage(navController = navHostController)
        }
        composable(FooduRoutes.HAHA){
            Haha()
        }

    }
}