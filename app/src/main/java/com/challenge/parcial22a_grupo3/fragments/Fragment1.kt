package com.challenge.parcial22a_grupo3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.challenge.parcial22a_grupo3.R
import kotlinx.android.synthetic.main.fragment_1.*

class Fragment1 : Fragment() {

    private lateinit var v: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_1, container, false)

        return v
    }

    override fun onStart() {
        super.onStart()

        logIn_button.setOnClickListener(){
            //var currentMessage = Message(txtField.text.toString())
            //Fragment1Directions.actionHomeFragmentToFirstFragment(currentMessage)
            v.findNavController().navigate(Fragment1Directions.actionFragment1ToFragment2())
        }
    }
}