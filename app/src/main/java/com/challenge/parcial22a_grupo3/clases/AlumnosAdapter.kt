package com.challenge.parcial22a_grupo3.clases

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.challenge.parcial22a_grupo3.R

class AlumnosAdapter(
    private var listaAlumnos: MutableList<Alumno>,
    val onItemClick: (Int) -> Boolean
): RecyclerView.Adapter<AlumnoHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_alumnos,parent,false)
        return (AlumnoHolder(view))
    }

    override fun onBindViewHolder(holder: AlumnoHolder, posicion: Int) {
        holder.setName(listaAlumnos[posicion].name)

        holder.getCardLayout().setOnClickListener{
            onItemClick(posicion)
        }
    }

    override fun getItemCount() = listaAlumnos.size




}