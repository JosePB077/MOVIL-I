package modelos

import com.example.appsuperheroes.R
import modelos.Heroe

object Heroes {
    val heroes = listOf(
        Heroe(
            nameRes = R.string.heroe1,
            descriptionRes = R.string.descripcion1,
            imageRes = R.drawable.android_superheroe1
        ),
        Heroe(
            nameRes = R.string.heroe2,
            descriptionRes = R.string.descripcion2,
            imageRes = R.drawable.android_superheroe2
        ),
        Heroe(
            nameRes = R.string.heroe3,
            descriptionRes = R.string.descripcion3,
            imageRes = R.drawable.android_superheroe3
        ),
        Heroe(
            nameRes = R.string.heroe4,
            descriptionRes = R.string.descripcion4,
            imageRes = R.drawable.android_superheroe4
        ),
        Heroe(
            nameRes = R.string.heroe5,
            descriptionRes = R.string.descripcion5,
            imageRes = R.drawable.android_superheroe5
        ),
        Heroe(
            nameRes = R.string.heroe6,
            descriptionRes = R.string.descripcion6,
            imageRes = R.drawable.android_superheroe6
        )
    )
}