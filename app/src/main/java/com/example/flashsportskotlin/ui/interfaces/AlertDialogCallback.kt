package com.example.flashsportskotlin.ui.interfaces

import android.content.DialogInterface

interface AlertDialogCallback {
    fun onNegativeButtonClick(dialog: DialogInterface)
    fun onPositiveButtonClick()
}