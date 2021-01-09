import models.Filter
import models.Movie
import java.time.*
import java.util.*

fun main() {

    val movies = listOf<Movie>(
        Movie(
            name = "Um Sonho de Liberdade",
            releaseYear = LocalDate.of(1995, Calendar.MARCH, 17),
            duration = 142,
            rate = 9.3,
            genders = listOf("Drama")
        ),
        Movie(
            name = "O Poderoso Chefão",
            releaseYear = LocalDate.of(1972, Calendar.SEPTEMBER, 10),
            duration = 175,
            rate = 9.2,
            genders = listOf("Crime", "Drama")
        ),
        Movie(
            name = "Batman: O Cavaleiro das Trevas",
            releaseYear = LocalDate.of(2008, Calendar.JULY, 18),
            duration = 152,
            rate = 9.0,
            genders = listOf("Action", "Crime", "Drama")
        )
    )

    val filter = Filter(movies)
    for (movie in filter.genderOf("Crime")) {
        println(movie.name)
    }
}