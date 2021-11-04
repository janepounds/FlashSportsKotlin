package com.example.flashsportskotlin.ui.activities


import android.content.DialogInterface
import android.view.LayoutInflater
import androidx.navigation.ui.setupWithNavController
import com.example.flashsportskotlin.R
import com.example.flashsportskotlin.databinding.ActivityMainBinding
import com.example.flashsportskotlin.ui.base.BaseActivity
import com.example.flashsportskotlin.ui.interfaces.AlertDialogCallback
import com.example.flashsportskotlin.utils.makeGone
import com.example.flashsportskotlin.utils.makeVisible
import dagger.hilt.android.AndroidEntryPoint

private const val HOME_FRAGMENT = 1

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(), AlertDialogCallback {

    private var currentFragment = -1

    override fun getActivityBinding(inflater: LayoutInflater)= ActivityMainBinding.inflate(inflater)

    override fun setupTheme() {
    }

    override fun setupNavigation() {
      val bottomNavIds = setOf(
          R.id.homeFragment,
          R.id.coachesFragment,
          R.id.sportsCategoriesFragment,
          R.id.accountFragment,
      )
        binding.navView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener{_,destination,_ ->
            val id = destination.id
            if(bottomNavIds.contains(id)) binding.navView.makeVisible() else binding.navView.makeGone()
            currentFragment = if(id == R.id.homeFragment) HOME_FRAGMENT else -1

        }
    }

    override fun onBackPressed() {
        when(currentFragment){
            HOME_FRAGMENT ->{
                return
            }
        }
        super.onBackPressed()
    }

    override fun onNegativeButtonClick(dialog: DialogInterface) {
        dialog.dismiss()
    }

    override fun onPositiveButtonClick() {
        if (currentFragment == HOME_FRAGMENT) finishAndRemoveTask()
    }
}