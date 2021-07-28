package com.yash.mapify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_show.*
import kotlinx.android.synthetic.main.activity_start.*


class show : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        //recieve STOP

        val stop = intent.getStringExtra("stop")
        setstop.text="TO :  $stop"

        //RECIEVE START
        val start = intent.getStringExtra("start")
        setstart.text="FROM : $start"



    }

    fun showbutton(view: View)
    {
        //RECIEVE START
        val stop = intent.getStringExtra("stop")
        val start = intent.getStringExtra("start")


        Toast.makeText(this,"LOADING MAP...", Toast.LENGTH_SHORT).show()


        val intent= Intent(this,MapsActivity::class.java)


        //SEND

        intent.putExtra("stop",stop)
        intent.putExtra("start",start)

        startActivity(intent)
    }


}
