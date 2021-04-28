package com.example.template_app_itau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList:RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaView()
        carregaAvatar()
        setItemsLista()
    }

    private fun iniciaView(){
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    fun carregaAvatar(){
        findViewById<ImageView>(R.id.avatar).apply {
            setImageResource(R.drawable.ic_baseline_face_24)
        }
    }

    private fun setItemsLista(){
         adapter.setItensList(
             arrayListOf(
                 MenuItemModel(
                     "Cartões"
                 ),
                 MenuItemModel(
                     "Meus cartões"
                 ),
                 MenuItemModel(
                     "Investimentos"
                 ),
                 MenuItemModel(
                     "Portabilidade de salário"
                 ),
                 MenuItemModel(
                     "Cartões"
                 ),
                 MenuItemModel(
                     "Meus cartões"
                 ),
                 MenuItemModel(
                     "Investimentos"
                 ),
                 MenuItemModel(
                     "Portabilidade de salário"
                 )
             )
         )
    }
}