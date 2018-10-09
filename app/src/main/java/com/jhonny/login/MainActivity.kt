package com.jhonny.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* //primero importamos

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btLogin.setOnClickListener {
            val usuario = etUser.text.toString()
            val pass = etPass.text.toString()

            if (usuario != "" && pass != "") {                          //que no sten vacios
                if ((usuario == "jhonny") and (pass == "hola123")) {    //pasa validacion

                    var intent = Intent(applicationContext, SecondActivity::class.java) // creamos la intencion
                    startActivity(intent)                                               //  iniciar el activity por medio de la intencion
                    finish()                                                            // sirve para finalizar el activity y no pode regresar de nuevo a la pagina de logeo

                } else                                                  //no pasa validacion
                    toast("credenciales incorrectas")

            } else {
                if (usuario == "")
                    etUser.error = "Usuario no puede ser vacio"
                if (pass == "")
                    etPass.error = "La contraseña no puede ser vacia"

            }
        }


    }

    fun toast(mensaje: String, tiempo: Int = Toast.LENGTH_LONG) {
        Toast.makeText(applicationContext, mensaje, tiempo).show()
    }
}

