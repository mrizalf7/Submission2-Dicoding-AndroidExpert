package com.dicoding.ninthProject.di

import com.dicoding.ninthProject.core.domain.usecase.MovieInteractor
import com.dicoding.ninthProject.core.domain.usecase.MovieUseCase
import com.dicoding.ninthProject.detail.DetailMovieViewModel
import com.dicoding.ninthProject.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}
val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailMovieViewModel(get()) }
}