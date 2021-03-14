package com.tunm.tmdbclient.domain.usecase

import com.tunm.tmdbclient.data.model.tvshow.TvShow
import com.tunm.tmdbclient.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}