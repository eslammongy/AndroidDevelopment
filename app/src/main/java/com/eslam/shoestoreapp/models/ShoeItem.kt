package com.eslam.shoestoreapp.models


data class ShoeItem(var shoeName: String, var shoeSize: Double, var shoeBrand: String, var shoeDesc: String,
                var shoeImages: List<String> = mutableListOf())



