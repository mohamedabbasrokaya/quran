package com.mabbar.quran.ui.home

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.mabbar.quran.R
import com.mabbar.quran.ui.home.fragments.Fragment_Quran
import com.mabbar.quran.ui.home.fragments.Fragment_Sebha
import com.mabbar.quran.ui.home.fragments.Fragment_hadeeth
import com.mabbar.quran.ui.home.fragments.Fragment_radio

class home_activity:AppCompatActivity() {
    lateinit var bottomNavigation:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNavigation = findViewById(R.id.bottom_navigation_bar)
        bottomNavigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { menuitem ->
            if (menuitem.itemId == R.id.navigation_quran) {
                push_fragment(Fragment_Quran())


            } else if (menuitem.itemId == R.id.navigation_sebha) {
                push_fragment(Fragment_Sebha())

            } else if (menuitem.itemId == R.id.navigation_hadeeth) {
                push_fragment(Fragment_hadeeth())

            } else if (menuitem.itemId == R.id.navigation_radio) {
                push_fragment(Fragment_radio())

            }
            return@OnItemSelectedListener true;

        })
        bottomNavigation.selectedItemId=R.id.navigation_quran

    }

        fun push_fragment(fragment:Fragment){
           supportFragmentManager
               .beginTransaction()
               .replace(R.id.fragment_container,fragment)
               .commit()
       }

    }
