package com.tunm.tmdbclient.domain.repository

import com.tunm.tmdbclient.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?

    suspend fun updateMovies(): List<Movie>?
}