package com.icochico.kotlinmapbox

import android.app.Application
import com.mapbox.mapboxsdk.Mapbox

/**
 *  Main application class.
 */

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Mapbox Access token
        Mapbox.getInstance(applicationContext, getString(R.string.app_access_token))
    }
}
