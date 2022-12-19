package com.aytachuseynli.daggerusage

import com.google.android.material.shape.ShapeAppearanceModel
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun  inject(activity: MainActivity)
}