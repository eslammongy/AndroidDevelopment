package com.eslam.gussesgame.screens.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.eslam.gussesgame.R
import com.eslam.gussesgame.databinding.GameFragmentBinding


class GameFragment : Fragment() {

    private lateinit var gameViewModel: GameViewModel
    private lateinit var binding: GameFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.game_fragment, container, false)
        gameViewModel = ViewModelProvider(this)[GameViewModel::class.java]

        binding.correctButton.setOnClickListener {
            gameViewModel.onCorrect()
            updateUserScore()
            updateGuessWord()
        }
        binding.skipButton.setOnClickListener {
            gameViewModel.onSkip()
            updateUserScore()
            updateGuessWord()
        }

        updateUserScore()
        updateGuessWord()
        return binding.root
    }

    fun gameFinished(){
        findNavController().navigate(GameFragmentDirections.actionGameFragmentToScoreFragment())
    }
    private fun updateGuessWord(){
        binding.wordText.text = gameViewModel.currentWord
    }

    private fun updateUserScore(){
        binding.scoreText.text =  gameViewModel.userScore.toString()
    }

}