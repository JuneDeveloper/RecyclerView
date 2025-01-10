package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailsActivity : AppCompatActivity() {

    private lateinit var mainDetailsLL:LinearLayout

    private lateinit var toolbarTB:Toolbar
    private lateinit var backButtonBTN:Button
    private lateinit var imageDetailsIV:ImageView
    private lateinit var nameDetailsTV:TextView
    private lateinit var descriptionDetailsTV:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        init()

        backButtonBTN.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        getInfo()

        updateDetails()
    }

    private fun getInfo() {
        var cloth: Object? = null
        if (intent.hasExtra("cloth")) {
            cloth = intent.getSerializableExtra("cloth") as Object
        }
        if (cloth != null) {
            imageDetailsIV.setImageResource(cloth.image)
            nameDetailsTV.text = cloth.name
            descriptionDetailsTV.text = cloth.description
        }
    }

    private fun updateDetails() {
        mainDetailsLL.setOnLongClickListener {
            val dialog = AlertDialog.Builder(this)
            val inflater = this.layoutInflater
            val dialogView = inflater.inflate(R.layout.update_dialog, null)
            dialog.setView(dialogView)
            val editName = dialogView.findViewById<EditText>(R.id.updateNameET)
            val editDescription = dialogView.findViewById<EditText>(R.id.updateDescriptionET)

            dialog.setTitle("Обновить запись?")
            dialog.setMessage("введите данные в поля ниже:")
            dialog.setPositiveButton("Обновить") { _, _ ->
                nameDetailsTV.text = editName.text.toString()
                descriptionDetailsTV.text = editDescription.text.toString()
            }
            dialog.setNegativeButton("Отмена") { _, _ ->
            }
            dialog.create().show()
            false
        }
    }

    private fun init() {
        mainDetailsLL = findViewById(R.id.mainDetailsLL)
        backButtonBTN = findViewById(R.id.backButtonBTN)
        imageDetailsIV = findViewById(R.id.imageDetailsIV)
        nameDetailsTV = findViewById(R.id.nameDetailsTV)
        descriptionDetailsTV = findViewById(R.id.descriptionDetailsTV)
        toolbarTB = findViewById(R.id.toolbarTB)
        setSupportActionBar(toolbarTB)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.exitItem -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}