package com.tunm.tmdbclient.presentation.di.core

import com.tunm.tmdbclient.data.api.TMDBService
import com.tunm.tmdbclient.data.db.ArtistDao
import com.tunm.tmdbclient.data.db.MovieDao
import com.tunm.tmdbclient.data.db.TvShowDao
import com.tunm.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.tunm.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.tunm.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.tunm.tmdbclient.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.tunm.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.tunm.tmdbclient.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.tunm.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.tunm.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.tunm.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import com.tunm.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class LocalDataModule {
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Provides
    fun provideTvLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }
}