package com.tunm.tmdbclient.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tunm.tmdbclient.R
import com.tunm.tmdbclient.databinding.ActivityHomeBinding
import com.tunm.tmdbclient.presentation.artist.ArtistActivity
import com.tunm.tmdbclient.presentation.movie.MovieActivity
import com.tunm.tmdbclient.presentation.tvshow.TvShowActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        binding.movieButton.setOnClickListener {
            startActivity(Intent(this, MovieActivity::class.java))
        }

        binding.tvButton.setOnClickListener {
            startActivity(Intent(this, TvShowActivity::class.java))
        }

        binding.artistsButton.setOnClickListener {
            startActivity(Intent(this, ArtistActivity::class.java))
        }
    }
}