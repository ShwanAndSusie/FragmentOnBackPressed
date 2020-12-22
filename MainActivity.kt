package com.example.demofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.demofragment.fragment.TwoFragment

class MainActivity : AppCompatActivity(),IBackInterface {

    private var fragment : Fragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setSelectedFragment(fragment: Fragment) {
        this.fragment = fragment
    }

    override fun onBackPressed() {
        if (fragment != null && (fragment as TwoFragment).onBackPressed()) {
            //具体点击方法
        } else {
            super.onBackPressed()
        }
    }
}
