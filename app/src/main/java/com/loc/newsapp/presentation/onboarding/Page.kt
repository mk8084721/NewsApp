package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    var title : String,
    var describition : String,
    @DrawableRes var image : Int,
)

val pages = listOf(
    Page(
        title = "Welcome to 1st",
        describition = "Welcome to 1st its a new hhi hksdb fbjs fbsjvn hfj",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Welcome to 2st",
        describition = "Welcome to 2st its a new hhi hksdb fbjs fbsjvn hfj",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Welcome to 3st",
        describition = "Welcome to 3st its a new hhi hksdb fbjs fbsjvn hfj",
        image = R.drawable.onboarding3
    )
)
