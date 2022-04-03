package com.example.recyclerviewbatch04

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewbatch04.databinding.MovieRowBinding

class MovieAdapter(val callback:(Movie) -> Unit) : ListAdapter<Movie, MovieAdapter.MovieViewHolder>(MovieDiffUtil()) {
    var count = 0
    class MovieViewHolder(private val binding:MovieRowBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(movie:Movie){
            binding.movie = movie
        }

    }

    class MovieDiffUtil:DiffUtil.ItemCallback<Movie>(){
        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        count++
        Log.d("MovieAdapter","onCreateViewHolder $count")
        val binding = MovieRowBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        )
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie)
        holder.itemView.setOnClickListener{
            callback(movie)
        }
        //holder.binding.btn

    }
}