package com.example.firstlibrary

import android.content.Context
import android.widget.Toast

class ToastManager {
    fun showToast(context: Context) {
        Toast.makeText(context,"Toast is shown",Toast.LENGTH_LONG).show()
    }
}