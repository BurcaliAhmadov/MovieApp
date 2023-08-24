package com.ahmadov.movieapp.data.repository

import com.ahmadov.movieapp.data.remote.MovieApi
import com.ahmadov.movieapp.data.remote.dto.MoviesDTO
import com.ahmadov.movieapp.data.remote.dto.MoviesDetailDTO
import com.ahmadov.movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api : MovieApi) :MovieRepository {
    override suspend fun getMovies(search: String): MoviesDTO {
        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetail(imdbId: String): MoviesDetailDTO {
        return api.getMovieDetail(imdbID = imdbId)
    }
}