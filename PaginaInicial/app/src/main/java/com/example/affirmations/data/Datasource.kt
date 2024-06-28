package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(
                stringResourceId = R.string.affirmation1,
                imageResourceId = R.drawable.guerracivil,
                title = "Guerra Civil",
                releaseYear = "2024",
                duration = "1h 49m",
                category = "Ação"
            ),
            Affirmation(
                stringResourceId = R.string.affirmation2,
                imageResourceId = R.drawable.duna,
                title = "Duna 2",
                releaseYear = "2024",
                duration = "2h 46m",
                category = "Ficção científica"
            ),
            Affirmation(
                stringResourceId = R.string.affirmation3,
                imageResourceId = R.drawable.divertidamente,
                title = "Divertida Mente 2",
                releaseYear = "2024",
                duration = "1h 36m",
                category = "Infantil"
            ),
            Affirmation(
                stringResourceId = R.string.affirmation3,
                imageResourceId = R.drawable.deadpool,
                title = "Deadpool & Wolverine",
                releaseYear = "2024",
                duration = "2h 7m",
                category = "Ação"
            ),
            Affirmation(
            stringResourceId = R.string.affirmation3,
            imageResourceId = R.drawable.assassino,
            title = "Assassino Por Acaso",
            releaseYear = "2024",
            duration = "1h 55m",
            category = "Comédia"
            )
        )
    }
}
