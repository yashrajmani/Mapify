package com.yash.mapify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gobutton(view: View)
    {
        Toast.makeText(this,"Loading ...",Toast.LENGTH_SHORT).show()
        val intent=Intent(this,start::class.java)

        startActivity(intent)

    }


}