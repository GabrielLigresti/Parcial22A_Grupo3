package com.challenge.parcial22a_grupo3.fragments

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.challenge.parcial22a_grupo3.MainActivity
import com.challenge.parcial22a_grupo3.R
import com.challenge.parcial22a_grupo3.clases.Alumno
import com.challenge.parcial22a_grupo3.clases.AlumnosAdapter
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class Fragment2 : Fragment() {

    private lateinit var v : View
    private lateinit var navController : NavController
    private lateinit var appBarConfiguration :AppBarConfiguration

    lateinit var recAlumnos: RecyclerView

    var listaAlumnos : MutableList<Alumno> = ArrayList<Alumno>()

    private lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var alumnoListAdapter: AlumnosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_2, container, false)

        recAlumnos = v.findViewById(R.id.rec_view)

        return v
    }

    override fun onStart() {
        super.onStart()

        listaAlumnos.add(Alumno("Kenan","Chab","alumno de 22A",""))
        listaAlumnos.add(Alumno("Daniel","Otero","alumno de 22A",""))
        listaAlumnos.add(Alumno("Catalina","Buljevich","alumno de 22A",""))
        listaAlumnos.add(Alumno("Gabriel","Ligresti","alumno de 22A",""))


        recAlumnos.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)

        recAlumnos.layoutManager = linearLayoutManager

        alumnoListAdapter = AlumnosAdapter(listaAlumnos){ x->
            onItemClick(x)
        }

        recAlumnos.adapter = alumnoListAdapter


    }

    fun onItemClick(posicion: Int): Boolean{
        Snackbar.make(v, posicion.toString(), Snackbar.LENGTH_SHORT).show()
        return true
    }

}
