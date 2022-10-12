package com.fyaman.movie

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fyaman.movie.data.MovieModel

class MovieAdapter(
    private val listener: MovieListener,
    private val movieList: MutableList<MovieModel>,
        ) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //Item initialization
        private var ivMovie: ImageView = itemView.findViewById(R.id.iv_movie)
        fun bind(movie: MovieModel, listener: MovieListener) {
            ivMovie.setImageResource(movie.image)
            itemView.setOnClickListener {
                listener.onClicked(movie)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie_list,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(movieList[position], listener)
    }


    override fun getItemCount(): Int {
        return movieList.size
    }

}

interface MovieListener {
    fun onClicked(Movie: MovieModel)
}