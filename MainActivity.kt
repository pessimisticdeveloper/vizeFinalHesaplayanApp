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
   if (isonuc <= 44) {
                sonuc.setText(isonuc.toString() + "\n" + "Harf Notu: FF")
            } else if (45 <= isonuc && isonuc <= 54) {
                sonuc.setText(isonuc.toString() + "\n" + "Harf Notu: DE")
            } else if (55 <= isonuc && isonuc <= 59) {
                sonuc.setText(isonuc.toString() + "\n" + "Harf Notu: DD")
            } else if (60 <= isonuc && isonuc <= 69) {
                sonuc.setText(isonuc.toString() + "\n" + "Harf Notu: CC")
            } else if (70 <= isonuc && isonuc <= 79) {
                sonuc.setText(isonuc.toString() + "\n" + "Harf Notu: CB")
            } else if (80 <= isonuc && isonuc <= 84) {
                sonuc.setText(isonuc.toString() + "\n" + "Harf Notu: BB")
            } else if (85 <= isonuc && isonuc <= 89) {
                sonuc.setText(isonuc.toString() + "\n" + "Harf Notu: BA")
            } else if (90 <= isonuc && isonuc <= 100) {
                sonuc.setText(isonuc.toString() + "\n" + "Harf Notu: DE")
            }
        }}}
