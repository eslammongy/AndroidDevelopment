package com.eslam.gussesgame.screens.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
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

        binding.gameViewModel = gameViewModel
        binding.lifecycleOwner = this

        binding.correctButton.setOnClickListener {
            gameViewModel.onCorrect()
        }


        binding.skipButton.setOnClickListener {
            gameViewModel.onSkip()
        }

        gameViewModel.score.observe(viewLifecycleOwner) { score ->
            binding.scoreText.text = score.toString()
        }
        gameViewModel.word.observe(viewLifecycleOwner){word->
            binding.wordText.text = word.toString()
        }


        return binding.root
    }

    fun gameFinished(){
        val currentScore = gameViewModel.score.value ?: 0
        val action = GameFragmentDirections.actionGameFragmentToScoreFragment(currentScore)
        findNavController().navigate(action)
    }

}