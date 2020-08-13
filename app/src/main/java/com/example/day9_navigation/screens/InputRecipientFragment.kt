package com.example.day9_navigation.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.day9_navigation.R
import kotlinx.android.synthetic.main.fragment_amount_input.*
import kotlinx.android.synthetic.main.fragment_confirmation.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_input_recipient.*

class InputRecipientFragment : Fragment(), View.OnClickListener {

    lateinit var navController : NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input_recipient, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)

        recipient_button.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v){
            recipient_button -> {
                val bundle = bundleOf("username" to recipient_name_text.text.toString())
                navController.navigate(R.id.action_inputRecipientFragment_to_amountInput, bundle)
            }
        }
    }
}

