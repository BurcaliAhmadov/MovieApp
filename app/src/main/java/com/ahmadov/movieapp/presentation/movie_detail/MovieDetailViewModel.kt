package com.ahmadov.movieapp.presentation.movie_detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmadov.movieapp.domain.use_case.get_movie_detail.GetMovieDetails
import com.ahmadov.movieapp.util.Constants.IMDB_ID
import com.ahmadov.movieapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    private val getMovieUseCase: GetMovieDetails,
    private val savedStateHandle:SavedStateHandle

) :ViewModel() {



    private val _state = mutableStateOf<MovieDetailState>(MovieDetailState())
    val state : State<MovieDetailState> = _state

    init {
        savedStateHandle.get<String>(IMDB_ID)?.let {
            getMovieDetails(it)
        }

    }


    private fun getMovieDetails(imdbId :String) {


        getMovieUseCase.executeGetMovieDetails(imdbId = imdbId).onEach {

            when(it){

                is Resource.Success -> {
                    _state.value= MovieDetailState(movie = it.data)
                }
                is Resource.Error -> {
                    _state.value= MovieDetailState(error = it.message ?: "Error")
                }
                is Resource.Loading -> {
                    _state.value = MovieDetailState(isLoading = true)
                }

            }


        }.launchIn(viewModelScope)
    }


}