package com.vtb.core

object SmartFeatureApiProvider {
    inline fun <reified T : Any> provideApi(): T {
        return AppInjector.featureApiProvider.provideApi(T::class.java)
    }
}