package com.example.favorite.di

import com.example.favorite.FavoriteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

    val favModule = module {
        viewModel { FavoriteViewModel(get()) }
    }
