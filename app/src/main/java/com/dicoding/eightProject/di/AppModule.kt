package com.dicoding.eightProject.di

import com.dicoding.eightProject.core.domain.usecase.MovieInteractor
import com.dicoding.eightProject.core.domain.usecase.MovieUseCase
import com.dicoding.eightProject.detail.DetailMovieViewModel
import com.dicoding.eightProject.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}
val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailMovieViewModel(get()) }
}