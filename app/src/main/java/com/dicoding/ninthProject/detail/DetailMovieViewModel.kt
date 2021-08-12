package com.dicoding.ninthProject.detail

import androidx.lifecycle.ViewModel
import com.dicoding.ninthProject.core.domain.model.Movie
import com.dicoding.ninthProject.core.domain.usecase.MovieUseCase

class DetailMovieViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {
    fun setFavoriteMovie(movie: Movie, newStatus:Boolean) =
        movieUseCase.setFavoriteMovie(movie, newStatus)
}

