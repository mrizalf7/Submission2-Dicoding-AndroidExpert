package com.dicoding.ninthProject.core.utils

import com.dicoding.ninthProject.core.data.source.local.entity.MovieEntity
import com.dicoding.ninthProject.core.data.source.remote.response.MovieResponse
import com.dicoding.ninthProject.core.domain.model.Movie

object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                movieId = it.movieId,
                overview = it.overview,
                title = it.title,
                posterPath = it.posterPath,
                releaseDate = it.releaseDate,
                voteAverage = it.voteAverage,
                voteCount = it.voteCount,
                originalLanguage = it.originalLanguage,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                it.movieId,
                it.overview,
                it.title,
                it.posterPath,
                it.releaseDate,
                it.voteAverage,
                it.voteCount,
                it.originalLanguage,
                it.isFavorite
            )
        }

    fun mapDomainToEntity(movie: Movie) = MovieEntity(
        movie.movieId,
        movie.overview,
        movie.title,
        movie.posterPath,
        movie.releaseDate,
        movie.voteAverage,
        movie.voteCount,
        movie.originalLanguage,
        movie.isFavorite
    )
}