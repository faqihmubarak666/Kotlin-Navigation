package com.example.day9_navigation.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.day9_navigation.R
import com.example.day9_navigation.view_model.TransferViewModel
import kotlinx.android.synthetic.main.fragment_input_recipient.*

class InputRecipientFragment : Fragment(), View.OnClickListener {

    lateinit var navController : NavController
    val transferViewModel by activityViewModels<TransferViewModel>()

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
                navController.navigate(R.id.action_inputRecipientFragment_to_amountInput)
                transferViewModel.setRecipientName(recipient_name_text.text.toString())
                transferViewModel.setAccountNumber(recipient_account_text.text.toString().toInt())
                transferViewModel.setRecipientBank(recipient_bank.selectedItem.toString())
            }
        }
    }
}

