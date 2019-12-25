package com.example.buildvarianttesting

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Log.d(TAG, "===> BASE URL: ${BuildConfig.BASE_URL}")
        Log.d(TAG, "===> API VERSION: ${BuildConfig.API_VERSION}")

    }

}
