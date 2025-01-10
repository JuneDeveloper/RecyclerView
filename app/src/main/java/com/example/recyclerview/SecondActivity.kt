package com.example.recyclerview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    private val cloth = Object.cloth

    private lateinit var toolbarTB:Toolbar
    private lateinit var recycleViewRV:RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        toolbarTB = findViewById(R.id.toolbarTB)
        setSupportActionBar(toolbarTB)

        adapterAndBroadcast()
    }

    private fun adapterAndBroadcast() {
        recycleViewRV = findViewById(R.id.recycleViewRV)
        recycleViewRV.layoutManager = LinearLayoutManager(this)
        val adapter = MyRecycleAdapter(cloth)
        recycleViewRV.adapter = adapter
        recycleViewRV.setHasFixedSize(true)

        adapter.setOnClothClickListener(object :
            MyRecycleAdapter.OnClothClickListener {
            override fun onClothClick(cloths: Object, position: Int) {
                val intent = Intent(this@SecondActivity, DetailsActivity::class.java)
                intent.putExtra("cloth", cloths)
                startActivity(intent)
                finish()
            }
        })
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