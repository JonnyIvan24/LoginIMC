package com.jhonny.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)



        btCalcular.setOnClickListener {
            val estatura = etEstatura.text.toString()
            Log.d("Estatura: ", estatura) //Visualizar valores de variables en logcat d normal, e error, w warning
            if ( estatura == ""){
                etEstatura.error = "Debes de ingresar tu altura"
            } else {
                val altura = etEstatura.text.toString().toFloat()
                val i = Intent(this, ThirdActivity::class.java)
                i.putExtra("altura", altura)
                startActivity(i)
            }
        }
    }
}
