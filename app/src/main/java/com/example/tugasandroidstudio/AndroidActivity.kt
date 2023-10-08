package com.example.tugasandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val fragmentManager = supportFragmentManager
        val fragmentActivity = FragmentActivity()
        val fragment = fragmentManager.findFragmentByTag(FragmentActivity::class.java.simpleName)

        if (fragment !is FragmentActivity){
            fragmentManager
                .beginTransaction()
                .add(R.id.container, fragmentActivity, FragmentActivity::class.java.simpleName)
                .commit()
        }
    }
}