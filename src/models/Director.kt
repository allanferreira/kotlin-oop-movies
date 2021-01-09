package models

import java.time.LocalDate

class Director(name: String, birthday: LocalDate, movies: List<Movie>) : Person(name, birthday, movies)
