package com.example.animales

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgCaballo.setOnClickListener{
            activarSonido("caballo")
        }
        imgElefante.setOnClickListener{
            activarSonido("elefante")
        }
        imgGallo.setOnClickListener{
            activarSonido("gallo")
        }
        imgGato.setOnClickListener{
            activarSonido("gato")
        }
        imgChango.setOnClickListener{
            activarSonido("mono")
        }
        imgPato.setOnClickListener{
            activarSonido("pato")
        }
        imgPerro.setOnClickListener{
            activarSonido("perro")
        }
        imgRana.setOnClickListener{
            activarSonido("rana")
        }
        imgVaca.setOnClickListener{
            activarSonido("vaca")
        }


    }

    fun activarSonido(nombre : String){
        if(nombre.equals("caballo")){
            var mediaPlayer = MediaPlayer.create(this, R.raw.caballo);
            mediaPlayer.start()
        }else if(nombre.equals("elefante")){
            var mediaPlayer = MediaPlayer.create(this, R.raw.elefante);
            mediaPlayer.start()
        }
        else if(nombre.equals("gallo")){
            var mediaPlayer = MediaPlayer.create(this, R.raw.gallo);
            mediaPlayer.start()
        }
        else if(nombre.equals("gato")){
            var mediaPlayer = MediaPlayer.create(this, R.raw.gato);
            mediaPlayer.start()
        }
        else if(nombre.equals("mono")){
            var mediaPlayer = MediaPlayer.create(this, R.raw.mono);
            mediaPlayer.start()
        }else if(nombre.equals("pato")){
            var mediaPlayer = MediaPlayer.create(this, R.raw.pato);
            mediaPlayer.start()
        }
        else if(nombre.equals("perro")){
            var mediaPlayer = MediaPlayer.create(this, R.raw.perro);
            mediaPlayer.start()
        }
        else if(nombre.equals("rana")){
            var mediaPlayer = MediaPlayer.create(this, R.raw.rana);
            mediaPlayer.start()
        }
        else if(nombre.equals("vaca")){
            var mediaPlayer = MediaPlayer.create(this, R.raw.vaca);
            mediaPlayer.start()
        }


    }
}