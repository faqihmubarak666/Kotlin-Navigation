package com.example.day9_navigation.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.day9_navigation.R
import com.example.day9_navigation.view_model.TransferViewModel
import kotlinx.android.synthetic.main.fragment_amount_input.*
import kotlinx.android.synthetic.main.fragment_confirmation.*

class Confirmation : Fragment() {

    val transferViewModel : TransferViewModel by activityViewModels<TransferViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        transferViewModel.recipientName.observe(viewLifecycleOwner, Observer { name_confirmation.text = "Sent To : " + it.toString() })
        transferViewModel.accountNumber.observe(viewLifecycleOwner, Observer { account_number_confirmation.text =  it.toString() })
        transferViewModel.amount.observe(viewLifecycleOwner, Observer { amount_confirmation.text = "Rp. " + it.toString() })
        transferViewModel.recipientBank.observe(viewLifecycleOwner, Observer { bank_confirmation.text =  it.toString() })
    }

}