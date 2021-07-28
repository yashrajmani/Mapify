package com.yash.mapify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_start.*

class start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    fun startbutton(view: View)
    {


        //store
        val start=starttext.editableText.toString()

        Toast.makeText(this,"START TAKEN", Toast.LENGTH_SHORT).show()


        val intent= Intent(this,stop::class.java)

        //send
        intent.putExtra("start",start)



        startActivity(intent)

    }
}
