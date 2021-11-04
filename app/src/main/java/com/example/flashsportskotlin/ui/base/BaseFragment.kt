package com.example.flashsportskotlin.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController


abstract class BaseFragment<dataBinding: ViewDataBinding>: Fragment() {
    lateinit var binding: dataBinding
    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = getFragmentBinding(inflater, container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = this@BaseFragment
        }
        navController = findNavController()
        setupTheme()
        setupClickListeners()
    }

    abstract fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): dataBinding

    abstract fun setupTheme()

    abstract fun setupClickListeners()
}