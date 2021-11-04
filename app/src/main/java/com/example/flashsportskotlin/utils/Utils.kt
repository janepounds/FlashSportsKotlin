package com.example.flashsportskotlin.utils

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import com.example.flashsportskotlin.R

fun NavController.navigateUsingPopUp(popUpFragId: Int, destinationId: Int, args: Bundle? = null) {
    val navOptions = NavOptions.Builder()
        .setEnterAnim(R.anim.slide_in_right)
        .setExitAnim(R.anim.slide_out_left)
        .setPopEnterAnim(R.anim.slide_in_left)
        .setPopExitAnim(R.anim.slide_out_right)
        .setPopUpTo(popUpFragId, true)
        .build()
    navigate(destinationId, args, navOptions)
}