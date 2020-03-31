package com.vtb.core

interface FeatureApiProvider {
    fun <T : Any> provideApi(clazz: Class<out T>): T
}