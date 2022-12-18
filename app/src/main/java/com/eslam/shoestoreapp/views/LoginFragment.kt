package com.eslam.shoestoreapp.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.eslam.shoestoreapp.R
import com.eslam.shoestoreapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val loginBinding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater, R.layout.fragment_login, container, false)


        loginBinding.buttonLogin.setOnClickListener {
            navigateLoginToAnother()
        }
        loginBinding.buttonSignUp.setOnClickListener {
            navigateLoginToAnother()
        }

        return loginBinding.root
    }

    private fun navigateLoginToAnother(){
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToOnBoardingWelcomeFragment())
    }
}