package com.jikansoftware.com.holamundo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_hola_mundo.*

class HolaMundo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hola_mundo)
        setSupportActionBar(toolbar)

        Log.i("Ciclo de vida Activity","Inició la actividad")

        val text1 = "Inició la Activity!!!"
        val duration = Toast.LENGTH_SHORT

        val toast1 = Toast.makeText(applicationContext, text1, duration)
        toast1.show()

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo de vida Activity","Finalizó la actividad")

        val text2 = "Finalizó la Activity!!!"
        val duration = Toast.LENGTH_SHORT

        val toast2 = Toast.makeText(applicationContext, text2, duration)
        toast2.show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_hola_mundo, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
