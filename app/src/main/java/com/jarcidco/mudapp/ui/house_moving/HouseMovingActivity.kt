package com.jarcidco.mudapp.ui.house_moving

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jarcidco.mudapp.R
import com.jarcidco.mudapp.ui.house_moving.fragment.WhereYouNeedItFragment

class HouseMovingActivity : AppCompatActivity() {

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, HouseMovingActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house_moving)
        startWhereYouNeedItFragment()
    }

    private fun startWhereYouNeedItFragment() {
        val whereYouNeedItFragment = WhereYouNeedItFragment()
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, whereYouNeedItFragment)
        transaction.addToBackStack(whereYouNeedItFragment.TAG)
        transaction.commit()
    }

    override fun onBackPressed() {
        val fragmentManager = supportFragmentManager
        val count = fragmentManager.backStackEntryCount
        if (count == 1) {
            finish()
        } else {
            fragmentManager.popBackStack()
        }
    }
}
