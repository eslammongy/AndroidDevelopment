package com.eslam.shoestoreapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eslam.shoestoreapp.models.ShoeItem

class ShoeDetailViewModel: ViewModel() {

    private val shoeName = MutableLiveData<String>()
    private val shoePrise = MutableLiveData<String>()
    private val shoeSize = MutableLiveData<String>()
    private val shoeBrand = MutableLiveData<String>()
    private val shoeDesc = MutableLiveData<String>()

    fun validatesFields():Boolean{
        return sureFieldsNotEmpty(shoeName) &&
                sureFieldsNotEmpty(shoePrise) &&
                sureFieldsNotEmpty(shoeSize) &&
                sureFieldsNotEmpty(shoeDesc) &&
                sureFieldsNotEmpty(shoeBrand)
    }
    private fun sureFieldsNotEmpty(data: MutableLiveData<String>):Boolean{
        return data.value != null && data.value?.isNotEmpty() == true
    }

    private fun shoeSizeAsInt() : Int {
        if (sureFieldsNotEmpty(shoeSize)) return shoeSize.value?.toInt()!!
        return 0
    }

    private fun shoePriceAsDouble() : Double {
        if (sureFieldsNotEmpty(shoeSize)) return shoeSize.value?.toDouble()!!
        return 0.0
    }

    fun buildShoeItem() :ShoeItem{
        return ShoeItem(
            shoeName.value ?: "",
           shoePriceAsDouble() ,
            shoeSizeAsInt(),
            shoeBrand.value ?: "",
            shoeDesc.value ?: "",
            arrayListOf("")
        )
    }

}