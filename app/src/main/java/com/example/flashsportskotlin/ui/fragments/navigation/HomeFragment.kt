package com.example.flashsportskotlin.ui.fragments.navigation


import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.flashsportskotlin.databinding.FragmentHomeBinding
import com.example.flashsportskotlin.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?) = FragmentHomeBinding.inflate(inflater,container,false)

    override fun setupTheme() {

    }

    override fun setupClickListeners() {

    }

}