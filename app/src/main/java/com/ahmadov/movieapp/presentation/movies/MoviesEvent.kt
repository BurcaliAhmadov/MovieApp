package com.ahmadov.movieapp.presentation.movies

sealed class MoviesEvent {
    data class Search(val searchString :String):MoviesEvent()
}