package com.swlove.mvilibrary

import android.content.Context
import android.widget.Toast

class ToastClass {
    companion object {
        fun showToast(Context: Context, message: String) {
            Toast.makeText(Context, message, Toast.LENGTH_SHORT).show()
        }
    }
}