package com.dicoding.ninthProject.core.domain.repository

import com.dicoding.ninthProject.core.data.Resource
import com.dicoding.ninthProject.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {

    fun getMovie(): Flow<Resource<List<Movie>>>

    fun getFavoriteMovie(): Flow<List<Movie>>

    fun setFavoriteMovie(movie: Movie, state: Boolean)

}