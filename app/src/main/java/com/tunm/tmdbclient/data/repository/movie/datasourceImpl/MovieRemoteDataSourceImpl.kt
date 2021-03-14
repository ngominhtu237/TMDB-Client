package com.tunm.tmdbclient.data.repository.movie.datasourceImpl

import com.tunm.tmdbclient.data.api.TMDBService
import com.tunm.tmdbclient.data.model.movie.MovieList
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
        private val tmdbService: TMDBService,
        private val apiKey: String
): MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}