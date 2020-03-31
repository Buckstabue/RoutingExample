package com.vtb.core.di

import com.vtb.core.FeatureApiProvider
import dagger.BindsInstance
import dagger.Component
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

@CoreScope
@Component
interface CoreComponent : CoreApi {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance featureApiProvider: FeatureApiProvider,
            @BindsInstance cicerone: Cicerone<Router>
        ): CoreComponent
    }
}