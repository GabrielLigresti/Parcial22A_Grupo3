package com.challenge.parcial22a_grupo3.fragments

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.challenge.parcial22a_grupo3.MainActivity
import com.challenge.parcial22a_grupo3.R
import kotlinx.android.synthetic.main.activity_main.*


class Fragment2 : Fragment() {

    private lateinit var v : View
    private lateinit var navController : NavController
    private lateinit var appBarConfiguration :AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_2, container, false)

        return v
    }

    override fun onStart() {
        super.onStart()






    }

}
