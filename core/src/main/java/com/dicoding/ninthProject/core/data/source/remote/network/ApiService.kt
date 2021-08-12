package com.dicoding.ninthProject.core.data.source.remote.network

import com.dicoding.ninthProject.core.data.source.remote.network.ApiCredentials.API_KEY
import com.dicoding.ninthProject.core.data.source.remote.response.ListMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    suspend fun getLatestMovies(@Query("api_key") apiKey: String = API_KEY): ListMovieResponse

}
