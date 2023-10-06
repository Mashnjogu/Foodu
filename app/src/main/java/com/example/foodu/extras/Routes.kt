package com.example.foodu.extras

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.foodu.R

object FooduRoutes{
    const val HOME = "home"
    const val ORDERS = "orders"
    const val MESSAGE = "messages"
    const val EWALLET = "ewallet"
    const val PROFILE = "profile"
    const val WELCOME = "welcome"
}


data class FooduTopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val iconTextId: Int
)

val TOPLEVEL_DESTINATIONS = listOf(
    FooduTopLevelDestination(
        route = FooduRoutes.HOME,
        selectedIcon = Icons.Default.Home,
        iconTextId = R.string.tab_home
    ),
    FooduTopLevelDestination(
        route = FooduRoutes.ORDERS,
        selectedIcon = Icons.Default.MailOutline,
        iconTextId = R.string.tab_orders
    ),
    FooduTopLevelDestination(
        route = FooduRoutes.MESSAGE,
        selectedIcon = Icons.Default.Menu,
        iconTextId = R.string.tab_message
    ),
    FooduTopLevelDestination(
        route = FooduRoutes.EWALLET,
        selectedIcon = Icons.Default.ShoppingCart,
        iconTextId = R.string.tab_ewallet
    ),
    FooduTopLevelDestination(
        route = FooduRoutes.PROFILE,
        selectedIcon = Icons.Default.Person,
        iconTextId = R.string.tab_profile
    ),
)