package com.tunm.tmdbclient.presentation.di.artist

import com.tunm.tmdbclient.domain.usecase.GetArtistsUseCase
import com.tunm.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.tunm.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase, updateArtistsUseCase
        )
    }
}