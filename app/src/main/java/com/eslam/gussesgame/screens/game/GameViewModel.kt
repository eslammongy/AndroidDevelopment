package com.eslam.gussesgame.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    var currentWord= ""
    var userScore = 0
    private lateinit var wordsList : MutableList<String>
    init {
       resetList()
        nextWord()
    }
    private fun resetList() {
        wordsList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordsList.shuffle()
    }
    private fun nextWord(){
        if (wordsList.isEmpty()){
            // game finished
        }else{
            currentWord = wordsList.removeAt(0)
        }
    }

    fun onSkip(){
        userScore--
        nextWord()
    }

    fun onCorrect(){
        userScore++
        nextWord()
    }
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "Game View Model Destroyed")
    }
}