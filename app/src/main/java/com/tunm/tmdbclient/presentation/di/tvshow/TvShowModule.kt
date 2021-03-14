package com.tunm.tmdbclient.presentation.di.tvshow

import com.tunm.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.tunm.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.tunm.tmdbclient.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase, updateTvShowsUseCase
        )
    }
}