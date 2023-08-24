package com.ahmadov.movieapp.domain.repository

import com.ahmadov.movieapp.data.remote.dto.MoviesDTO
import com.ahmadov.movieapp.data.remote.dto.MoviesDetailDTO

interface MovieRepository {

    suspend fun getMovies(search:String) : MoviesDTO

    suspend fun getMovieDetail(imdbId:String) : MoviesDetailDTO
}