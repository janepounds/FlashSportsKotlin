package com.example.flashsportskotlin.ui.fragments


import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.flashsportskotlin.databinding.FragmentSplashBinding
import com.example.flashsportskotlin.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding>() {


    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?) = FragmentSplashBinding.inflate(inflater,container,false)

    override fun setupTheme() {

    }

    override fun setupClickListeners() {

    }



    override fun onResume() {
        super.onResume()
    }


}