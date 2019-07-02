package com.milicic.example.library_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.milicic.example.logger.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.log("I should be visible in the console!")
    }

}
