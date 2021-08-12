package com.dicoding.eightProject.detail

import androidx.lifecycle.ViewModel
import com.dicoding.eightProject.core.domain.model.Movie
import com.dicoding.eightProject.core.domain.usecase.MovieUseCase

class DetailMovieViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {
    fun setFavoriteMovie(movie: Movie, newStatus:Boolean) =
        movieUseCase.setFavoriteMovie(movie, newStatus)
}

