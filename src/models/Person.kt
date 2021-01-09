package models

import java.time.LocalDate

abstract class Person(val name: String, val birthday: LocalDate, val movies: List<Movie>)