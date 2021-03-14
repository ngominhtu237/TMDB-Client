package com.tunm.tmdbclient.presentation.di

import com.tunm.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.tunm.tmdbclient.presentation.di.movie.MovieSubComponent
import com.tunm.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}