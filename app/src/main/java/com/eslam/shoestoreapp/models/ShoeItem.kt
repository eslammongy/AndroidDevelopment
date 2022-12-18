package com.eslam.shoestoreapp.models


data class ShoeItem(var shoeName: String, var shoePrice: Double, var shoeSize: Int, var shoeBrand: String, var shoeDesc: String,
                var shoeImages: List<String> = mutableListOf())



