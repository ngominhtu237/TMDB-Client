package com.tunm.tmdbclient.presentation.di.core

import android.content.ContentProvider
import android.content.Context
import com.tunm.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.tunm.tmdbclient.presentation.di.movie.MovieSubComponent
import com.tunm.tmdbclient.presentation.di.tvshow.TvShowSubComponent
import dagger.Module
import dagger.Provides

@Module(subcomponents = [
    MovieSubComponent::class,
    TvShowSubComponent::class,
    ArtistSubComponent::class
])
class AppModule(private val context: Context) {

    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }
}