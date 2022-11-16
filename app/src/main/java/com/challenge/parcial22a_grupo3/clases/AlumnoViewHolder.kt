package com.challenge.parcial22a_grupo3.clases

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.challenge.parcial22a_grupo3.R
import kotlinx.android.synthetic.main.item_alumnos.view.*;
import kotlinx.android.synthetic.main.fragment_profile.*;
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kotlinx.android.synthetic.main.item_alumnos.view.ImageViewAlumno
import kotlinx.android.synthetic.main.item_alumnos.view.TextViewAlumnoBio
import kotlinx.android.synthetic.main.item_alumnos.view.TextViewAlumnoName
import kotlinx.android.synthetic.main.item_alumnos.view.TextViewAlumnoSurname

class AlumnoViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun render(alumnoModel: Alumno) {
        view.TextViewAlumnoName.text = alumnoModel.name
        view.TextViewAlumnoSurname.text = alumnoModel.surname
        view.TextViewAlumnoBio.text = alumnoModel.bio
        Glide.with(view.ImageViewAlumno.context).load(alumnoModel.urlImage).into(view.ImageViewAlumno)
    }

}
