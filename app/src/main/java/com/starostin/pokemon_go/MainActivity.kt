package com.starostin.pokemon_go

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.starostin.pokemon_go.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private val adapter = PlantAdapter()
    private val imageIdList = listOf(
        R.drawable.pok_1,
        R.drawable.pok_2,
        R.drawable.pok_3,
        R.drawable.pok_4,
        R.drawable.pok_5,
        R.drawable.pok_6,
        R.drawable.pok_7,
        R.drawable.pok_8,
        R.drawable.pok_9,
        R.drawable.pok_10,
        R.drawable.pok_11,
        R.drawable.pok_12,
        R.drawable.pok_13,
        R.drawable.pok_14,
        R.drawable.pok_15,
        R.drawable.pok_16,
        R.drawable.pok_17,
        R.drawable.pok_18,
        R.drawable.pok_19,
        R.drawable.pok_20,
        R.drawable.pok_21,
        R.drawable.pok_22,
        R.drawable.pok_23,
        R.drawable.pok_24,
        R.drawable.pok_25,
        R.drawable.pok_26,
        R.drawable.pok_27,
        R.drawable.pok_28,
        R.drawable.pok_29,
        R.drawable.pok_30,
        R.drawable.pok_31,
        R.drawable.pok_32,
        R.drawable.pok_33,
        R.drawable.pok_34,
        R.drawable.pok_35,
        R.drawable.pok_36,
        R.drawable.pok_37,
        R.drawable.pok_38,
        R.drawable.pok_39,
        R.drawable.pok_40
    )
    private var index = 0

    val pokemonNames = arrayOf(
        "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon",
        "Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie",
        "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill",
        "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate",
        "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu",
        "Raichu", "Sandshrew", "Sandslash", "Nidoran♀", "Nidorina",
        "Nidoqueen", "Nidoran♂", "Nidorino", "Nidoking", "Clefairy",
        "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@MainActivity, 4)
            rcView.adapter = adapter
            btnAdd.setOnClickListener{
                if ( index > 40)
                    index = 0
                val plant = Plant(imageIdList[index], pokemonNames[index])
                adapter.addPlant(plant)
                index++
            }
        }
    }
}