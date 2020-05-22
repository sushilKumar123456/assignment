package com.assigment.sushil.base

import android.arch.lifecycle.ViewModel
import com.assigment.sushil.injection.component.DaggerViewModelInjector
import com.assigment.sushil.injection.component.ViewModelInjector
import com.assigment.sushil.injection.module.NetworkModule
import com.assigment.sushil.ui.cars.ArticleListViewModel
import com.assigment.sushil.ui.cars.ArticleViewModel

abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is ArticleListViewModel -> injector.inject(this)
            is ArticleViewModel -> injector.inject(this)
        }
    }
}