package com.ajlombres.implicitexplicitintents

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        findViewById<Button>(R.id.openYoutube).setOnClickListener { openYoutube() }
        findViewById<Button>(R.id.openGmail).setOnClickListener { openGmail() }
        findViewById<Button>(R.id.openGdrive).setOnClickListener { openGdrive() }
        findViewById<Button>(R.id.displayMessages).setOnClickListener { displayMessages() }
        findViewById<Button>(R.id.displayPhotos).setOnClickListener { displayPhotos() }

    }

    private fun openYoutube() {
        val launchIntent = packageManager.getLaunchIntentForPackage("com.google.android.youtube")
        startActivity(launchIntent)
    }

    private fun openGmail() {
        val launchIntent = packageManager.getLaunchIntentForPackage("com.google.android.gm")
        startActivity(launchIntent)
    }

    private fun openGdrive() {
        val launchIntent = packageManager.getLaunchIntentForPackage("com.google.android.apps.docs")
        startActivity(launchIntent)
    }
    private fun displayMessages() {
        val myToast = Toast.makeText(applicationContext, "These messages are private!", Toast.LENGTH_SHORT)
        myToast.setGravity(Gravity.LEFT,200,200)
        myToast.show()
    }
    private fun displayPhotos(){
        val myToast = Toast.makeText(applicationContext,"These photos are private!",Toast.LENGTH_SHORT)
        myToast.setGravity(Gravity.LEFT,200,200)
        myToast.show()
    }
}
