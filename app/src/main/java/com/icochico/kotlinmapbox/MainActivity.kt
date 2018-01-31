package com.icochico.kotlinmapbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mapbox.mapboxsdk.maps.MapView


class MainActivity : AppCompatActivity() {

    private lateinit var mapView: MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapView = findViewById<MapView>(R.id.mapView)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync({
            // Customize map with markers, polylines, etc.
        })
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()

    }
    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }
    override fun onStop() {
        super.onStop()
        mapView.onStop()

    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)

    }
    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()

    }
    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }
}
