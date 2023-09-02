package com.ahmadov.movieapp.data.remote.dto

import com.ahmadov.movieapp.domain.model.Movie
import com.ahmadov.movieapp.presentation.movies.MoviesEvent
import com.google.gson.annotations.SerializedName



data class MoviesDto(

    @SerializedName("Response")
    val response: String,
    @SerializedName("Search")
    val search: List<Search>,
    @SerializedName("totalResults")
    val totalResults: String
)

fun MoviesDto.toMovieList() :List<Movie> {
    return search.map { search -> Movie(search.poster,search.title,search.year,search.imdbID) }
}