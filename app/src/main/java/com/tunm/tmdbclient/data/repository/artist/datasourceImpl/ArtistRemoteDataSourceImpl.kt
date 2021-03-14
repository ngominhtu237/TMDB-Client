package com.tunm.tmdbclient.data.repository.artist.datasourceImpl

import com.tunm.tmdbclient.data.api.TMDBService
import com.tunm.tmdbclient.data.model.artist.ArtistList
import com.tunm.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
        private val tmdbService: TMDBService,
        private val apiKey:String
): ArtistRemoteDataSource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

