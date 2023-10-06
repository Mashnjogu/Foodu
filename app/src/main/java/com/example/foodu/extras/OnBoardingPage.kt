package com.example.foodu.extras

import androidx.annotation.DrawableRes
import com.example.foodu.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
){
    object first: OnBoardingPage(
        image = R.drawable.onboarding1,
        title = "Order for Food",
        description = "We offer the best food delivery services"
    )
    object second: OnBoardingPage(
        image = R.drawable.onboarding2,
        title = "Easy Payments",
        description = "Pay at your convenience"
    )

    object third: OnBoardingPage(
        image = R.drawable.onboarding3,
        title = "Fast Delivery",
        description = "Delivery to you at a short period"
    )
}