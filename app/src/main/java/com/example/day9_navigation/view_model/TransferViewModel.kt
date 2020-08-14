package com.example.day9_navigation.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TransferViewModel : ViewModel() {

    val recipientName: MutableLiveData<String> = MutableLiveData("")
    val accountNumber: MutableLiveData<Int> = MutableLiveData(0)
    val recipientBank: MutableLiveData<String> = MutableLiveData("")
    val amount: MutableLiveData<Int> = MutableLiveData(0)

    fun setRecipientName(name: String) {
        recipientName.value = name
    }

    fun setAccountNumber(number: Int) {
        accountNumber.value = number
    }

    fun setRecipientBank(bank: String){
        recipientBank.value = bank
    }

    fun setAmount(nominal: Int){
        amount.value = nominal
    }
}