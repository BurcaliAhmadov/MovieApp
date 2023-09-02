package com.ahmadov.movieapp.domain.repository

import com.ahmadov.movieapp.data.remote.dto.MovieDetailDto
import com.ahmadov.movieapp.data.remote.dto.MoviesDto


interface MovieRepository {

    suspend fun getMovies(search : String) : MoviesDto

    suspend fun getMovieDetail(imdbId : String) : MovieDetailDto

}