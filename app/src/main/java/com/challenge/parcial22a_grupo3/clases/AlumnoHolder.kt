package com.challenge.parcial22a_grupo3.clases

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.challenge.parcial22a_grupo3.R

class AlumnoHolder(v: View): RecyclerView.ViewHolder(v){
    private lateinit var v: View

    init {
        this.v = v
    }

    fun setName(name: String){
        val txt: TextView = v.findViewById(R.id.text_nombre_alumno)
        txt.text = name
    }



    fun getCardLayout():CardView{
        return v.findViewById(R.id.cardView_alumno)
    }
}
