package com.tunm.tmdbclient.domain.usecase

import com.tunm.tmdbclient.data.model.movie.Movie
import com.tunm.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}