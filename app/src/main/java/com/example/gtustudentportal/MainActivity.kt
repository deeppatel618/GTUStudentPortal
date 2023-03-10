package com.example.gtustudentportal

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide();
        Handler().postDelayed({
                              val intent = Intent(this@MainActivity,LoginActivity::class.java);
            startActivity(intent,
                ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            finish();
        },2000);
   }
}