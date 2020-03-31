package com.vtb.core

import com.vtb.core.di.CoreApi

object AppInjector {
    lateinit var coreApi: CoreApi
        private set

    val featureApiProvider: FeatureApiProvider
        get() = coreApi.featureApiProvider()

    fun setCoreApi(coreApi: CoreApi) {
        this.coreApi = coreApi
    }
}