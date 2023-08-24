package com.ahmadov.movieapp.data.remote


import com.ahmadov.movieapp.data.remote.dto.MoviesDTO
import com.ahmadov.movieapp.data.remote.dto.MoviesDetailDTO
import com.ahmadov.movieapp.util.Constants.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    //https://www.omdbapi.com/?apikey=94d7923d&s=batman
    //https://www.omdbapi.com/?apikey=94d7923d&i=tt2975590
    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString:String,
        @Query("apikey") apiKey:String=API_KEY
    ):MoviesDTO

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbID:String,
        @Query("apikey") apiKey: String= API_KEY
    ):MoviesDetailDTO
}