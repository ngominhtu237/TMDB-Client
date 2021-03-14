package com.tunm.tmdbclient.data.repository.movie.datasourceImpl

import com.tunm.tmdbclient.data.db.MovieDao
import com.tunm.tmdbclient.data.model.movie.Movie
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(
        private val movieDao: MovieDao
): MovieLocalDataSource {
    override suspend fun getMoviesFromFB(): List<Movie> {
        return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteAllMovies()
        }
    }
}