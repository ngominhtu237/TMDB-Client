package com.tunm.tmdbclient.domain.repository

import com.tunm.tmdbclient.data.model.artist.Artist
import com.tunm.tmdbclient.data.model.movie.Movie

interface ArtistRepository {
    suspend fun getArtists(): List<Artist>?

    suspend fun updateArtists(): List<Artist>?
}