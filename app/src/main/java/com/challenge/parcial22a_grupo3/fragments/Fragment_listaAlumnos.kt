package com.challenge.parcial22a_grupo3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.findFragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.challenge.parcial22a_grupo3.R
import com.challenge.parcial22a_grupo3.clases.Alumno
import com.challenge.parcial22a_grupo3.clases.AlumnoList
import com.challenge.parcial22a_grupo3.clases.AlumnosAdapter
import com.challenge.parcial22a_grupo3.listeners.OnAlumnoSelectedListener
import kotlinx.android.synthetic.main.activity_home.*


class Fragment_listaAlumnos : Fragment(), OnAlumnoSelectedListener {

    private lateinit var recyclerView : RecyclerView

    private lateinit var navHostFragment: NavHostFragment

    private lateinit var v: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment


        v = inflater.inflate(R.layout.fragment_lista_alumnos, container, false)

        return v

    }

    override fun onStart() {
        super.onStart()
        recyclerView = v.findViewById(R.id.rec_view)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(context)
        val decoration = DividerItemDecoration(context, manager.orientation)
        recyclerView.layoutManager = manager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AlumnosAdapter(AlumnoList.listaAlumnos, this)

        recyclerView.addItemDecoration(decoration)
    }

    override fun onAlumnoSelected(alumno: Alumno) {
        v.findNavController()
            .navigate(
                Fragment_listaAlumnosDirections
                    .actionFragmentListaAlumnosToFragmentProfile(alumno)
            )
    }
}