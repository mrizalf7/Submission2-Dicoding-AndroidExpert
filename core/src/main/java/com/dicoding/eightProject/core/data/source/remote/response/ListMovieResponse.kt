package com.dicoding.eightProject.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListMovieResponse(

    @field:SerializedName("results")
    val items: List<MovieResponse>

)