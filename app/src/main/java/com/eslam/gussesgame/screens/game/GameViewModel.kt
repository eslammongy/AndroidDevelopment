package com.eslam.gussesgame.screens.game

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private var currentWord = MutableLiveData<String>()
    val word: LiveData<String>
    get() = currentWord


    private val userScore = MutableLiveData<Int>()
    val score : LiveData<Int>
    get() = userScore

    private lateinit var wordsList: MutableList<String>

    init {
        resetList()
        nextWord()
        userScore.value = 0
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

    private fun nextWord() {
        if (wordsList.isEmpty()) {
           resetList()
        } else {
            currentWord.value = wordsList.removeAt(0)
        }
    }

    fun onSkip() {
        userScore.value = (userScore.value)?.minus(1)
        nextWord()
    }

    fun onCorrect() {
        userScore.value = (userScore.value)?.plus(1)
        nextWord()
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "Game View Model Destroyed")
    }
}