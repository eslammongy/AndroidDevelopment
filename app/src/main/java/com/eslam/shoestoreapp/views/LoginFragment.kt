package com.eslam.shoestoreapp.views

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
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