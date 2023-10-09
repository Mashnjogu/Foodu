package com.example.foodu

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.foodu.extras.FooduRoutes
import com.example.foodu.onboarding.CreateNewAccount
import com.example.foodu.onboarding.Home
import com.example.foodu.onboarding.SignInPage
import com.example.foodu.onboarding.WelcomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun FooduAppContent(
    modifier: Modifier = Modifier
){
    val selectedDestination = remember{ mutableStateOf(FooduRoutes.HOME) }
    val navController = rememberNavController()
    val backStackEntry = navController.currentBackStackEntryAsState()

    Scaffold(
        bottomBar = {

        }
    ){
        Box(modifier = modifier.padding(it)){
//            MainScreenNavigationComponents(paddingValues = it, navHostController = navController)
        }
    }
}


@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
@Composable
fun MainScreenNavigationComponents(
    startDestination: String,
    navHostController: NavHostController
){
    NavHost(navController = navHostController, startDestination = startDestination){
        composable(FooduRoutes.WELCOME){
            WelcomeScreen(navHostController)
        }

        composable(FooduRoutes.SIGNIN){
            SignInPage(navHostController)
        }

        composable(FooduRoutes.HOME){
            Home(navHostController)
        }
        composable(FooduRoutes.CREATENEWACCOUNT){
            CreateNewAccount(navHostController)
        }
    }
}