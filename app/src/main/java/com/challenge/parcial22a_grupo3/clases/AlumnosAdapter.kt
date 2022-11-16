package com.challenge.parcial22a_grupo3.clases

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.challenge.parcial22a_grupo3.R
import com.challenge.parcial22a_grupo3.listeners.OnAlumnoSelectedListener

class AlumnosAdapter(
    private var listaAlumnos: List<Alumno>,
    private val onAlumnoSelectedListener: OnAlumnoSelectedListener
) : RecyclerView.Adapter<AlumnoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_alumnos, parent, false)
        return (AlumnoViewHolder(view))
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, posicion: Int) {
        var item = listaAlumnos[posicion]

        holder.render(item)
        holder.itemView.setOnClickListener{
            onAlumnoSelectedListener.onAlumnoSelected(item)
        }
    }

    override fun getItemCount() = listaAlumnos.size


}