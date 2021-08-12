package com.dicoding.eightProject.core.domain.repository

import com.dicoding.eightProject.core.data.Resource
import com.dicoding.eightProject.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {

    fun getMovie(): Flow<Resource<List<Movie>>>

    fun getFavoriteMovie(): Flow<List<Movie>>

    fun setFavoriteMovie(movie: Movie, state: Boolean)

}