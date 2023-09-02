package com.ahmadov.movieapp.domain.model

import com.ahmadov.movieapp.data.remote.dto.Rating
import com.google.gson.annotations.SerializedName

data class MovieDetail (
    val actors: String,
    val awards: String,
    val country: String,
    val director: String,
    val genre: String,
    val language: String,
    val poster: String,
    val rated: String,
    val released: String,
    val title: String,
    val type: String,
    val year: String,
    val imdbRating: String,
    val imdbVotes: String
)
