package com.venrique.taller5

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.venrique.taller5.fragments.FragmentoCuatro
import com.venrique.taller5.fragments.FragmentoDos
import com.venrique.taller5.fragments.FragmentoTres
import com.venrique.taller5.fragments.FragmentoUno
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FragmentoUno.OnFragmentInteractionListener, FragmentoDos.OnFragmentInteractionListener, FragmentoTres.OnFragmentInteractionListener, FragmentoCuatro.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = Navigation.findNavController(this,R.id.nav_host_fragment)

        val boton: BottomNavigationItemView = findViewById<BottomNavigationItemView>(R.id.next_fragment)

        boton.setOnClickListener {
            navController.navigate(R.id.next_action)
        }
    }


}
