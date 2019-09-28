package com.jarcidco.mudapp.ui.login.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.jarcidco.mudapp.R
import com.jarcidco.mudapp.ui.house_moving.HouseMovingActivity
import com.jarcidco.mudapp.ui.house_moving.fragment.WhereYouNeedItFragment
import com.jarcidco.mudapp.ui.login.LoginActivity

class LoginUser : Fragment() {
    val TAG: String? = LoginUser::javaClass.name

    lateinit var loginButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_login_user, container, false)
        loginButton = view.findViewById(R.id.buttonLogin)
        loginButton.setOnClickListener { startActivity(HouseMovingActivity.getIntent(activity!!.applicationContext))}
        return view
    }
}
