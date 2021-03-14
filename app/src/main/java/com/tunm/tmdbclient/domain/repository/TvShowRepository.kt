package com.tunm.tmdbclient.domain.repository

import com.tunm.tmdbclient.data.model.movie.Movie
import com.tunm.tmdbclient.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?

    suspend fun updateTvShows(): List<TvShow>?
}