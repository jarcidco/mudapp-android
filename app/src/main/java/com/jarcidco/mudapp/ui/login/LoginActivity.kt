package com.jarcidco.mudapp.ui.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jarcidco.mudapp.R
import android.widget.Button
import android.widget.TextView
import com.jarcidco.mudapp.ui.house_moving.fragment.WhereYouNeedItFragment
import com.jarcidco.mudapp.ui.login.fragment.LoginUser

class LoginActivity : AppCompatActivity() {



    companion object{

        public fun getIntent(context:Context):Intent{
            val intent = Intent(context,LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK  or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        showLogin()
    }

private fun showLogin(){
    val whereYouNeedItFragment = LoginUser()
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
