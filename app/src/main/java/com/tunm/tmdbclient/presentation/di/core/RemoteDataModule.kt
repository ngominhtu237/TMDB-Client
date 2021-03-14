package com.tunm.tmdbclient.presentation.di.core

import com.tunm.tmdbclient.data.api.TMDBService
import com.tunm.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.tunm.tmdbclient.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.tunm.tmdbclient.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.tunm.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.tunm.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class RemoteDataModule(private val apiKey: String) {

    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService, apiKey)
    }
}