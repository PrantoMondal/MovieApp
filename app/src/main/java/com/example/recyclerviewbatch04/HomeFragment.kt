package com.example.recyclerviewbatch04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewbatch04.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        val adapter = MovieAdapter(::onReceiveMovieFromAdapter)
        adapter.submitList(movieList)
        binding.movieRecyclerView.layoutManager = LinearLayoutManager(activity)
        binding.movieRecyclerView.adapter = adapter
        return binding.root
    }

    fun onReceiveMovieFromAdapter(movie:Movie){
        Toast.makeText(activity,"${movie.name}",Toast.LENGTH_SHORT).show()
    }

}