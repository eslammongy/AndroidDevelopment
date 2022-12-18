package com.eslam.shoestoreapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eslam.shoestoreapp.models.ShoeItem

class ShoesViewModel: ViewModel() {
    private val _shoesList = MutableLiveData<MutableList<ShoeItem>>()
    val shoesList: LiveData<MutableList<ShoeItem>> get() = _shoesList

    fun emptyShoesList():Boolean{
        return _shoesList.value == null || _shoesList.value?.isEmpty() == true
    }

    fun addShoeItem(shoe: ShoeItem){
        if (_shoesList.value == null){
            _shoesList.value = mutableListOf(shoe)
        }else{
            _shoesList.value?.add(shoe)
        }
    }
}