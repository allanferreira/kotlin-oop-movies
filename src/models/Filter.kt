package models

class Filter(private val movies: List<Movie>) {

    fun rateOf(rate: Double) : List<Movie> {
        return movies.filter { movie -> movie.rate == rate }
    }

    fun rateBiggerOrEgualOf(rate: Double) : List<Movie> {
        return movies.filter { movie -> movie.rate >= rate }
    }

    fun genderOf(gender: String) : List<Movie> {
        return movies.filter { movie -> movie.genders.contains(gender) }
    }

}