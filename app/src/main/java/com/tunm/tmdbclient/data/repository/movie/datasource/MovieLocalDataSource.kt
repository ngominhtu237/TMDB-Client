package com.tunm.tmdbclient.data.repository.movie.datasource

import com.tunm.tmdbclient.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromFB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}