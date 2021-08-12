package com.dicoding.eightProject.core.domain.usecase

import com.dicoding.eightProject.core.data.Resource
import com.dicoding.eightProject.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {
    fun getAllMovie(): Flow<Resource<List<Movie>>>
    fun getFavoriteMovie(): Flow<List<Movie>>
    fun setFavoriteMovie(movie: Movie, state: Boolean)
}