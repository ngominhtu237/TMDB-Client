package com.tunm.tmdbclient.presentation.di.core

import com.tunm.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.tunm.tmdbclient.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.tunm.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.tunm.tmdbclient.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.tunm.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.tunm.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.tunm.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }


    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}