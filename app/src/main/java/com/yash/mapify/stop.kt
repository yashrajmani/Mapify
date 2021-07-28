package com.yash.mapify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_show.*
import kotlinx.android.synthetic.main.activity_start.*
import kotlinx.android.synthetic.main.activity_stop.*

class stop : AppCompatActivity() {

    companion object
    {
        const val START="start"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stop)
    }

    fun stopbutton(view: View)
    {

        //store
        val stop=stoptext.editableText.toString()

        //recieve START

        val start = intent.getStringExtra("start")

        Toast.makeText(this,"STOP TAKEN", Toast.LENGTH_SHORT).show()

        val intent= Intent(this,show::class.java)


        //send
        intent.putExtra("stop",stop)
        intent.putExtra("start",start)


        startActivity(intent)

    }
}