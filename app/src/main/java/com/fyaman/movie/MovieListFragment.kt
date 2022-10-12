package com.fyaman.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.fyaman.movie.data.MovieModel
import com.fyaman.movie.data.mockMovieData


class MovieListFragment : Fragment(), MovieListener {
    private lateinit var rvMovieList: RecyclerView
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        rvMovieList = view.findViewById(R.id.rv_design)
        setupAdapter()
    }

    private fun setupAdapter() {
        rvMovieList.adapter = MovieAdapter( this@MovieListFragment,mockMovieData)
        rvMovieList.layoutManager = androidx.recyclerview.widget.GridLayoutManager(context, 2)
    }

    override fun onClicked(Movie: MovieModel) {
        navController.navigate(R.id.action_movieListFragment_to_movieDetailsFragment,Bundle().apply {
            putString("movieModel",Movie.toJson())
        })

    }
}