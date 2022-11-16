package com.challenge.parcial22a_grupo3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.challenge.parcial22a_grupo3.R
import kotlinx.android.synthetic.main.fragment_profile.*;
import kotlinx.android.synthetic.main.fragment_profile.ImageViewAlumno
import kotlinx.android.synthetic.main.fragment_profile.TextViewAlumnoBio
import kotlinx.android.synthetic.main.fragment_profile.TextViewAlumnoName
import kotlinx.android.synthetic.main.fragment_profile.TextViewAlumnoSurname
import kotlinx.android.synthetic.main.item_alumnos.*
import kotlinx.android.synthetic.main.item_alumnos.view.*

class Fragment_profile : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var alumnoData = Fragment_profileArgs.fromBundle(requireArguments()).alumno
        TextViewAlumnoName.text = alumnoData.name
        TextViewAlumnoSurname.text = alumnoData.surname
        TextViewAlumnoBio.text = alumnoData.bio
        Glide.with(view).load(alumnoData.urlImage).into(ImageViewAlumno)
    }
    
}