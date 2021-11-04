package com.example.flashsportskotlin.ui.fragments


import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.flashsportskotlin.R
import com.example.flashsportskotlin.data.models.ScreenItem
import com.example.flashsportskotlin.databinding.FragmentIntroBinding
import com.example.flashsportskotlin.ui.adapters.screen.IntroAdapter
import com.example.flashsportskotlin.ui.base.BaseFragment
import com.example.flashsportskotlin.utils.navigateUsingPopUp
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IntroFragment : BaseFragment<FragmentIntroBinding>(){
    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?)= FragmentIntroBinding.inflate(inflater,container,false)

    override fun setupTheme() {
        setupViewPager()

    }

    override fun setupClickListeners() {
        binding.skipTv.setOnClickListener {
            navController.navigateUsingPopUp(R.id.introFragment, R.id.action_global_welcomeFragment)
        }
        binding.nextBtn.setOnClickListener {
            val currentItem = binding.viewPager.currentItem
            if (currentItem + 1 < binding.viewPager.adapter?.itemCount!!) {
                binding.viewPager.setCurrentItem(currentItem + 1, true)
            } else {
                navController.navigateUsingPopUp(R.id.introFragment, R.id.action_global_welcomeFragment)
            }
        }

    }

    private fun setupViewPager(){
        val screenItems: ArrayList<ScreenItem> = ArrayList()
        screenItems.add(ScreenItem(drawableId = R.drawable.ic_coach_instructor, title = getString(R.string.intro_screen_1)))
        screenItems.add(ScreenItem(drawableId = R.drawable.ic_training, title = getString(R.string.intro_screen_2)))
        screenItems.add(ScreenItem(drawableId = R.drawable.ic_ratings, title = getString(R.string.intro_screen_3)))

        val introAdapter = IntroAdapter(screenItems)
        binding.viewPager.adapter = introAdapter
        binding.viewPager.offscreenPageLimit = 3

        val tabConfigurationStrategy = TabLayoutMediator.TabConfigurationStrategy { _: TabLayout.Tab, _: Int -> }
        TabLayoutMediator(binding.viewpagerIndicator, binding.viewPager, true, tabConfigurationStrategy)

    }

}