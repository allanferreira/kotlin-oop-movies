package models

import java.time.LocalDate

class Movie(
    val name: String,
    val releaseYear: LocalDate,
    val duration: Int,
    val rate: Double = 0.0,
    val genders: List<String>
) {
    val directors = mutableListOf<Director>()
    val actors = mutableListOf<Actor>()
}