package com.copetiny.androidmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.copetiny.androidmaster.firstapp.FirstAppActivity
import android.content.Intent
import android.widget.SearchView
import com.copetiny.androidmaster.imccalculator.ImcCalculatorActivity
import com.copetiny.androidmaster.settings.SettingsActivity
import com.copetiny.androidmaster.superheroapp.SuperHeroListActivity
import com.copetiny.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperHero = findViewById<Button>(R.id.btnSuperHero)
        val btnSetting = findViewById<Button>(R.id.btnSettings)
        btnSaludApp.setOnClickListener{navigateToSaludApp()}
        btnImcApp.setOnClickListener{navigateToImcApp()}
        btnTODO.setOnClickListener { navigateToTodoApp() }
        btnSuperHero.setOnClickListener{ navigateToSuperHeroApp() }
        btnSetting.setOnClickListener { navigateToSettingsApp() }
    }

    private fun navigateToSettingsApp(){
        val intent = Intent(this,SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperHeroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToTodoApp(){
        val intent = Intent(this, TodoActivity::class.java )
        startActivity(intent)
    }

   private fun navigateToImcApp(){
    val intent = Intent(this,ImcCalculatorActivity::class.java )
       startActivity(intent)
   }

   private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}