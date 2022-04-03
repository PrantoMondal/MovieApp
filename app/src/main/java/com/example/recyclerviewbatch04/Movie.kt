package com.example.recyclerviewbatch04

data class Movie(
    val id: Int,
    val name: String,
    val category: String,
    var rating: Double,
    var poster: Int = R.drawable.poster
)
val movieList = mutableListOf<Movie>(
    Movie(1,"Titanic","Drama",8.2),
    Movie(2,"Transformer","Action",8.5),
    Movie(3,"Avengers","Action",9.0),
    Movie(4,"Brave Heart","Drama",8.5),
    Movie(5,"Total Recall","Drama",7.2),
    Movie(6,"Avengers:End Game","Drama",9.5),
    Movie(7,"Mechanic","Drama",8.0),
    Movie(8,"Mechanic","Drama",8.0),
    Movie(9,"BatMan","Action",7.0),
    Movie(10,"SpyderMam","Drama",9.0),
)