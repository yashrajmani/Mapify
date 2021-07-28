package com.yash.mapify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.yash.mapify.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

        //todo use intent passed locatioons

//      FINAL
//        START STOP RECIVED

//    val stop = intent.getStringExtra("stop")
//        val start = intent.getStringExtra("start")

        override fun onMapReady(googleMap: GoogleMap)
        {
            val pat = LatLng(25.59,85.16)
            googleMap.addMarker(MarkerOptions().position(pat).title("Marker in PATNA")
            )
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(pat))

            //controls
            //zoom button
            googleMap.uiSettings.setZoomControlsEnabled(true)
            //zoom gestures
            googleMap.uiSettings.setZoomGesturesEnabled(true)
            //scroll,tilt, rotate
            googleMap.uiSettings.setScrollGesturesEnabled(true)
            googleMap.uiSettings.setTiltGesturesEnabled(true)
            googleMap.uiSettings.setRotateGesturesEnabled(true)









        }

    }