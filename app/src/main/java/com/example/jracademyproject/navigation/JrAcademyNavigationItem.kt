package com.example.jracademyproject.navigation

import android.view.animation.AnticipateInterpolator
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import com.example.jracademyproject.R

sealed class JrAcademyNavigationItem(
    val screenRoute: String,
    val data: Any? = null,
    @StringRes val pageTitle: Int? = null,
    val iconName:Int?,

    @DrawableRes val bottomNavigationIcon: Int? = null
) {

    object GameListScreen :
        JrAcademyNavigationItem(
            screenRoute = "dashboard_screen",
            bottomNavigationIcon = R.drawable.ic_games,
            iconName =R.string.icon_name_games
        )

    object FavoritesScreen :
        JrAcademyNavigationItem(
            screenRoute = "favorites_screen" ,
            bottomNavigationIcon = R.drawable.ic_favorites,
            iconName = R.string.icon_name_favorite
        )
    object Detail:
        JrAcademyNavigationItem(
            screenRoute = "content_screen?id={id}",
            iconName = androidx.appcompat.R.drawable.abc_ic_clear_material )

}
