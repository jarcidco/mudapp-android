
package com.jarcidco.mudapp.ui.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.jarcidco.mudapp.R

class LoginActivity : AppCompatActivity() {



    companion object{

        public fun getIntent(context:Context):Intent{
            val intent = Intent(context,LoginActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }


}
