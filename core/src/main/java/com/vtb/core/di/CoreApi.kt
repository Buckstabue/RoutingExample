package com.vtb.core.di

import com.vtb.core.FeatureApiProvider
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

interface CoreApi {
    val featureApiProvider: FeatureApiProvider
    val cicerone: Cicerone<Router>
}