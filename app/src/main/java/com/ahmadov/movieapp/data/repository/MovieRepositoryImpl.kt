package com.ahmadov.movieapp.data.repository


import com.ahmadov.movieapp.data.remote.MovieAPI
import com.ahmadov.movieapp.data.remote.dto.MovieDetailDto
import com.ahmadov.movieapp.data.remote.dto.MoviesDto

import com.ahmadov.movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api : MovieAPI) :MovieRepository {

    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(searchString = search)
    }
    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}