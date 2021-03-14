package com.tunm.tmdbclient.data.repository.movie.datasource

import com.tunm.tmdbclient.data.api.TMDBService
import com.tunm.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}