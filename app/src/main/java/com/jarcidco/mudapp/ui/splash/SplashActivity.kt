package com.jarcidco.mudapp.ui.splash

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.jarcidco.mudapp.R

class SplashActivity : AppCompatActivity() {

    lateinit var needMovingButton: Button
    lateinit var iAmTransporter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        needMovingButton = findViewById(R.id.need_move_button)
        iAmTransporter = findViewById(R.id.i_am_transporter_button)

        needMovingButton.setOnClickListener({
            //TODO: Go to login Activity with user param
        })

        iAmTransporter.setOnClickListener({
            //TODO: Go to login Activity with transporter param}
        })
    }
}
