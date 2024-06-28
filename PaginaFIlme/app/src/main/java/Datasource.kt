package com.example.paginafilme.data

import com.example.paginafilme.R

class Datasource {
    fun loadActors(): List<Pair<Int, String>> {
        return listOf(
            Pair(R.drawable.ator1, "Cailee Spaeny"),
            Pair(R.drawable.ator2, "Kirsten Dunst"),
            Pair(R.drawable.ator3, "Wagner Moura"),
            Pair(R.drawable.ator4, "Jesse Plemons"),
            Pair(R.drawable.ator5, "Stephen Henderson"),
            Pair(R.drawable.ator6, "Nick Offerman")
            )
    }
}
