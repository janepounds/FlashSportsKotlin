package com.example.flashsportskotlin.utils

import android.content.Context
import com.example.flashsportskotlin.R
import com.example.flashsportskotlin.ui.interfaces.AlertDialogCallback
import com.google.android.material.dialog.MaterialAlertDialogBuilder

fun showAlertDialog(context: Context, positionBtnText: String, title: String, subTitle: String, listener: AlertDialogCallback) {
    val resources = context.resources

    MaterialAlertDialogBuilder(context)
        .setTitle(title)
        .setMessage(subTitle)
        .setCancelable(true)
        .setNegativeButton(resources.getString(R.string.cancel)) { dialog, _ ->
            listener.onNegativeButtonClick(dialog = dialog)
        }
        .setPositiveButton(positionBtnText) { _, _ ->
            listener.onPositiveButtonClick()
        }
        .show()


}