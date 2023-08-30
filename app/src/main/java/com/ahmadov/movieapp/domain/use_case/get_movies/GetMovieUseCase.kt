package com.ahmadov.movieapp.domain.use_case.get_movies


import com.ahmadov.movieapp.data.remote.dto.toMovieList
import com.ahmadov.movieapp.domain.model.Movie
import com.ahmadov.movieapp.domain.repository.MovieRepository
import com.ahmadov.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(private val repository:MovieRepository) {
    fun executeGetMovies(search:String):Flow<Resource<List<Movie>>> = flow{
        try{
            emit(Resource.Loading())
            val movieList = repository.getMovies(search = search)
            if(movieList.response=="true"){
                emit(Resource.Success(movieList.toMovieList()))
            }else{
                emit(Resource.Error(message = "No Movie Found!",null))
            }

        }catch (e:IOError){
            emit(Resource.Error("No Internet Connection"))
        }catch (e : Exception){
            emit((Resource.Error(e.localizedMessage ?:"Error")))
        }

    }
}