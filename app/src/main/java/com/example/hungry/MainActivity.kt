package com.example.hungry

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val fragmentManager = supportFragmentManager

    val fragment_home:Fragment_home = Fragment_home()
    val fragment_restaurant:Fragment_restaurant = Fragment_restaurant()
    val fragment_recommend:Fragment_recommend = Fragment_recommend()
    val fragment_worldcup:Fragment_worldcup = Fragment_worldcup()
    val fragment_mypage:Fragment_mypage = Fragment_mypage()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val transaction = fragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.navigation_home -> {
                transaction.replace(R.id.fragment, fragment_home).commitAllowingStateLoss()
            }
            R.id.navigation_restaurant -> {
                transaction.replace(R.id.fragment, fragment_restaurant).commitAllowingStateLoss()
            }
            R.id.navigation_recommend -> {
                transaction.replace(R.id.fragment, fragment_recommend).commitAllowingStateLoss()
            }
            R.id.navigation_worldcup -> {
                transaction.replace(R.id.fragment, fragment_worldcup).commitAllowingStateLoss()
            }
            R.id.navigation_mypage -> {
                transaction.replace(R.id.fragment, fragment_mypage).commitAllowingStateLoss()
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        var transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment, fragment_home).commitAllowingStateLoss()
    }
}
