package com.example.moviestv.domain.use_cases.movie

import com.example.moviestv.domain.repository.MovieRepository

class UpdateUpcomingMoviesUseCase(private val repository: MovieRepository) {
    fun execute() = repository.updateUpcomingMovies()
}