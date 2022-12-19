package com.aytachuseynli.daggerusage

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAddress(): Address{
      return Address("BAKU")
    }
}