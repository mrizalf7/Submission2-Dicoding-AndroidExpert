package com.dicoding.eightProject.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val movieId: Int,
    val overview: String,
    val title: String,
    val posterPath: String,
    val releaseDate: String,
    val voteAverage: Double,
    val voteCount: Double,
    val originalLanguage: String,
    var isFavorite: Boolean
):Parcelable