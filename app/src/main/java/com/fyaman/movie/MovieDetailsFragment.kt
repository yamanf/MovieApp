package com.fyaman.movie

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.fyaman.movie.R
import com.fyaman.movie.data.MovieModel
import kotlin.properties.Delegates

class MovieDetailsFragment : Fragment() {
    private lateinit var ivBackButton : ImageView
    private lateinit var ivMovieBanner : ImageView
    private lateinit var ivMovieImage : ImageView
    private lateinit var tvTitle: TextView
    private lateinit var tvYear: TextView
    private lateinit var tvMinute: TextView
    private lateinit var tvGenre: TextView
    private lateinit var tvDescription: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
    }

    private fun setupView(view: View){
        ivBackButton = view.findViewById(R.id.ivBackButton)
        ivMovieBanner = view.findViewById(R.id.movieBanner)
        ivMovieImage = view.findViewById(R.id.movieImage)
        tvTitle = view.findViewById(R.id.tvTitle)
        tvYear = view.findViewById(R.id.tvYear)
        tvMinute = view.findViewById(R.id.tvMinute)
        tvGenre = view.findViewById(R.id.tvGenre)
        tvDescription = view.findViewById(R.id.tvDescription)

        ivBackButton.setOnClickListener{
            findNavController().navigate(R.id.action_movieDetailsFragment_to_movieListFragment)
        }


        arguments?.let {
            val movieData = it.getString("movieModel")

            movieData?.let { safeMovieData ->
                val movie = MovieModel.fromJson(safeMovieData)
                ivMovieBanner.setImageResource(movie.banner)
                ivMovieImage.setImageResource(movie.image)
                tvTitle.text = movie.movieName
                tvYear.text = movie.year.toString()
                tvMinute.text = movie.time.toString()
                tvGenre.text = movie.genre
                tvDescription.text = movie.description

            }
        }

    }


}