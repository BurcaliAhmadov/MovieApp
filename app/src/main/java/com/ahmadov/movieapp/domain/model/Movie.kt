package com.ahmadov.movieapp.domain.model

import com.google.gson.annotations.SerializedName

data class Movie(
    val poster: String,
    val title: String,
    val year: String,
    val imdbID: String
)
