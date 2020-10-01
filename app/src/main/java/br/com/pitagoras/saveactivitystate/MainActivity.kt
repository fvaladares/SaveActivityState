package br.com.pitagoras.saveactivitystate

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * Em Kotlin temos lista mutáveis e imutáveis
     */
    var names = arrayListOf<String>() // Criamos uma lista vazia
    var adapter: ArrayAdapter<String>? = null // Pega um elemento da lista e preenche um TV.
    // Este TV está no arquivo de layout do Próprio Android mapeado na constante android.R.layout.simple_list_item_1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        listView_Names.adapter = adapter
    }
}