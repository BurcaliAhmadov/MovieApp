package com.ahmadov.movieapp.data.remote.dto

import com.ahmadov.movieapp.domain.model.MovieDetail
import com.google.gson.annotations.SerializedName

data class MovieDetailDto(
    @SerializedName("Actors")
    val actors: String,
    @SerializedName("Awards")
    val awards: String,
    @SerializedName("BoxOffice")
    val boxOffice: String,
    @SerializedName("Country")
    val country: String,
    @SerializedName("DVD")
    val dVD: String,
    @SerializedName("Director")
    val director: String,
    @SerializedName("Genre")
    val genre: String,
    @SerializedName("Language")
    val language: String,
    @SerializedName("Metascore")
    val metaScore: String,
    @SerializedName("Plot")
    val plot: String,
    @SerializedName("Poster")
    val poster: String,
    @SerializedName("Production")
    val production: String,
    @SerializedName("Rated")
    val rated: String,
    @SerializedName("Ratings")
    val ratings: List<Rating>,
    @SerializedName("Released")
    val released: String,
    @SerializedName("Response")
    val response: String,
    @SerializedName("Runtime")
    val runtime: String,
    @SerializedName("Title")
    val title: String,
    @SerializedName("Type")
    val type: String,
    @SerializedName("Website")
    val website: String,
    @SerializedName("Writer")
    val writer: String,
    @SerializedName("Year")
    val year: String,
    @SerializedName("imdbID")
    val imdbID: String,
    @SerializedName("imdbRating")
    val imdbRating: String,
    @SerializedName("imdbVotes")
    val imdbVotes: String
)

fun MovieDetailDto.toMovieDetail() : MovieDetail {

    return MovieDetail(actors, awards, country, director, genre, language, poster, rated, released, title, type, year, imdbRating, imdbVotes)
}