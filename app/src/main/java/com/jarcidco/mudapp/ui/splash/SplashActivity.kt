package com.jarcidco.mudapp.ui.splash

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jarcidco.mudapp.R
import com.jarcidco.mudapp.ui.house_moving.HouseMovingActivity

class SplashActivity : AppCompatActivity() {

    lateinit var needMovingButton: Button
    lateinit var iAmTransporter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        needMovingButton = findViewById(R.id.need_move_button)
        iAmTransporter = findViewById(R.id.i_am_transporter_button)

        needMovingButton.setOnClickListener {
            startActivity(HouseMovingActivity.getIntent(this))
        }

        iAmTransporter.setOnClickListener({
            //TODO: Go to login Activity with transporter param}
        })
    }
}
