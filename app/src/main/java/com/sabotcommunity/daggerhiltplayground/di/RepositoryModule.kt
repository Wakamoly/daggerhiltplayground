package com.sabotcommunity.daggerhiltplayground.di

import com.sabotcommunity.daggerhiltplayground.repository.MainRepository
import com.sabotcommunity.daggerhiltplayground.retrofit.BlogRetrofit
import com.sabotcommunity.daggerhiltplayground.retrofit.NetworkMapper
import com.sabotcommunity.daggerhiltplayground.room.BlogDao
import com.sabotcommunity.daggerhiltplayground.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMainRepository(
        blogDao: BlogDao,
        retrofit: BlogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): MainRepository{
        return MainRepository(blogDao,retrofit,cacheMapper,networkMapper)
    }
}