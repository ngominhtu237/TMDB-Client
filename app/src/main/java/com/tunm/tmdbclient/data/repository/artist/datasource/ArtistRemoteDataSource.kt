package com.tunm.tmdbclient.data.repository.artist.datasource
import com.tunm.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
   suspend fun getArtists(): Response<ArtistList>
}