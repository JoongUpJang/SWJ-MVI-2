package com.swlove.swjmvi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swlove.mvilibrary.ToastClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastClass.showToast(this, "Hello World!")
    }
}