package com.vtb.core.di

import com.vtb.core.FeatureApiProvider
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

interface CoreApi {
    fun featureApiProvider(): FeatureApiProvider
    fun cicerone(): Cicerone<Router>
}