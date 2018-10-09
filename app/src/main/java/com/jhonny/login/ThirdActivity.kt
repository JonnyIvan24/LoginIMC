package com.jhonny.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val altura = intent.getFloatExtra("altura", 0.0f)
        interpretaAltura(altura)
    }

    fun interpretaAltura(altura: Float){
        var rutaFoto = "url"
        var resultado = "No sé"

        when{
            altura <  1.6 -> {
                resultado = "Eres un hobbit"
                rutaFoto = "https://vignette.wikia.nocookie.net/eldragonverde/images/d/de/Frodo_Bols%C3%B3n.jpg/revision/latest?cb=20121125185316&path-prefix=es"
            }
            altura in 1.6..1.8 -> {
                resultado = "Eres un simple humano"
                rutaFoto = "https://hips.hearstapps.com/es.h-cdn.co/fotoes/images/noticias-cine/sean-bean-muerte-favorita/132146672-1-esl-ES/Sean-Bean-el-hombre-de-las-mil-muertes-elige-su-favorita.jpg?resize=480:*"
            }
            altura in 1.8..1.9 -> {
                resultado = "ATM mi elfo hermoso"
                rutaFoto = "https://static0.srcdn.com/wordpress/wp-content/uploads/2017/02/Orlando-Bloom-as-Legolas-Greenleaf-The-Lord-of-the-Rings-Fellowship-of-the-Ring-Bow.jpg"
            }
            else -> {
                resultado = "No la friegues eres un troll!!!"
                rutaFoto = "https://vignette.wikia.nocookie.net/eldragonverde/images/1/17/C_trolls.jpg/revision/latest?cb=20130105201012&path-prefix=es"
            }
        }
        Picasso.get().load(rutaFoto).into(ivResultado)
        tvResultado.text = resultado
        /*
        el when sustituye to esto que viene a continuación
        if(altura <= 1.59){
            resultado = "Eres un hobbit"
            rutaFoto = "https://vignette.wikia.nocookie.net/eldragonverde/images/d/de/Frodo_Bols%C3%B3n.jpg/revision/latest?cb=20121125185316&path-prefix=es"
        } else if (altura in 1.6..1.8){
            resultado = "Eres un simple humano"
            rutaFoto = "https://hips.hearstapps.com/es.h-cdn.co/fotoes/images/noticias-cine/sean-bean-muerte-favorita/132146672-1-esl-ES/Sean-Bean-el-hombre-de-las-mil-muertes-elige-su-favorita.jpg?resize=480:*"
        } else if ( altura in 1.8..1.9){
                resultado = "ATM mi elfo hermoso"
                rutaFoto = "https://static0.srcdn.com/wordpress/wp-content/uploads/2017/02/Orlando-Bloom-as-Legolas-Greenleaf-The-Lord-of-the-Rings-Fellowship-of-the-Ring-Bow.jpg"
        } else {
            resultado = "No la friegues eres un troll!!!"
            rutaFoto = "https://vignette.wikia.nocookie.net/eldragonverde/images/1/17/C_trolls.jpg/revision/latest?cb=20130105201012&path-prefix=es"
        }
        Picasso.get().load(rutaFoto).into(ivResultado)
        tvResultado.text = resultado
        */
    }
}
