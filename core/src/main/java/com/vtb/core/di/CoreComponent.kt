package com.vtb.core.di

import com.vtb.core.FeatureApiProvider
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

class CoreComponent(
    override val featureApiProvider: FeatureApiProvider,
    override val cicerone: Cicerone<Router>
) : CoreApi