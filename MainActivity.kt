package com.example.notortalamashesaplama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vize:EditText=findViewById(R.id.vizenotu)
        val final:EditText=findViewById(R.id.finalnotu)
        val sonuc:TextView=findViewById(R.id.sonucid)
        val btnHesapla: Button=findViewById(R.id.btnHesapla)

        btnHesapla.setOnClickListener{
            val vize:Int=Integer.parseInt(vizenotu.text.toString())
            val final:Int=Integer.parseInt(finalnotu.text.toString())
            val isonuc = (vize*40)/100 + (final*60)/100
            sonuc.text=isonuc.toString()
        }


    }
}