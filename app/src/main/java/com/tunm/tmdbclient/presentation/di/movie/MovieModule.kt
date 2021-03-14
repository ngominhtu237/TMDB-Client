package com.tunm.tmdbclient.presentation.di.movie

import com.tunm.tmdbclient.domain.usecase.GetMoviesUseCase
import com.tunm.tmdbclient.domain.usecase.UpdateMoviesUseCase
import com.tunm.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase, updateMoviesUseCase
        )
    }
}