package com.dicoding.ninthProject.core.domain.usecase

import com.dicoding.ninthProject.core.data.Resource
import com.dicoding.ninthProject.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {
    fun getAllMovie(): Flow<Resource<List<Movie>>>
    fun getFavoriteMovie(): Flow<List<Movie>>
    fun setFavoriteMovie(movie: Movie, state: Boolean)
}