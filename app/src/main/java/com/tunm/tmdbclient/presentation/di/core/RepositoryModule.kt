package com.tunm.tmdbclient.presentation.di.core

import com.tunm.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.tunm.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.tunm.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.tunm.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.tunm.tmdbclient.data.repository.movie.MovieRepositoryImpl
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.tunm.tmdbclient.data.repository.tvshow.TvShowRepositoryImpl
import com.tunm.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.tunm.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.tunm.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.tunm.tmdbclient.domain.repository.ArtistRepository
import com.tunm.tmdbclient.domain.repository.MovieRepository
import com.tunm.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource, movieCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDataSource: TvShowRemoteDataSource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(tvShowRemoteDataSource, tvShowLocalDataSource, tvShowCacheDataSource)
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistLocalDataSource: ArtistLocalDataSource,
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(artistRemoteDataSource, artistLocalDataSource, artistCacheDataSource)
    }
}