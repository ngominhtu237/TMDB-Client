package com.tunm.tmdbclient.data.repository.movie.datasourceImpl

import com.tunm.tmdbclient.data.model.movie.Movie
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl: MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}