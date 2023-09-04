package com.ahmadov.movieapp.presentation.movie_detail

import com.ahmadov.movieapp.domain.model.MovieDetail

data class MovieDetailState (
    val movie : MovieDetail?=null,
    val error : String = "",
    val isLoading : Boolean =false
)