package com.tunm.tmdbclient.domain.usecase

import com.tunm.tmdbclient.data.model.artist.Artist
import com.tunm.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}