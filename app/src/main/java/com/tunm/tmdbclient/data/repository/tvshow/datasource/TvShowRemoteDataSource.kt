package com.tunm.tmdbclient.data.repository.tvshow.datasource

import com.tunm.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
   suspend fun getTvShows(): Response<TvShowList>
}