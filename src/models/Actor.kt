package models

import java.time.LocalDate

class Actor(name: String, birthday: LocalDate, movies: List<Movie>, val role: String) : Person(name, birthday, movies)