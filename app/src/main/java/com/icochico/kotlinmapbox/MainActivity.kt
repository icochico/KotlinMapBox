package com.icochico.kotlinmapbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mapbox.mapboxsdk.Mapbox

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mapbox Access token
        Mapbox.getInstance(applicationContext,
                "")
    }
}
