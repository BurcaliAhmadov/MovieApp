package com.ahmadov.movieapp.domain.use_case.get_movie_detail

import com.ahmadov.movieapp.data.remote.dto.toMovieDetail
import com.ahmadov.movieapp.domain.model.MovieDetail
import com.ahmadov.movieapp.domain.repository.MovieRepository
import com.ahmadov.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError
import javax.inject.Inject

class GetMovieDetails @Inject constructor(private val repository: MovieRepository){

    fun executeGetMovieDetails(imdbId:String) : Flow<Resource<MovieDetail>> = flow {
        try{
            emit(Resource.Loading())
            val movieDetail=repository.getMovieDetail(imdbId = imdbId)
            emit(Resource.Success(movieDetail.toMovieDetail()))
        }catch (e: IOError){
            emit(Resource.Error("No Internet Connection"))
        }catch (e : Exception){
            emit((Resource.Error(e.localizedMessage ?:"Error")))
        }
    }

}