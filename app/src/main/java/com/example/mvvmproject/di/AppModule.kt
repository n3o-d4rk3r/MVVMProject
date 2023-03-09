package com.example.mvvmproject.di

import com.example.mvvmproject.data.remote.ApiService
import com.example.mvvmproject.data.remote.RemoteDataSource
import com.example.mvvmproject.data.remote.RetrofitClient
import com.example.mvvmproject.data.repository.MyRepository
import com.example.mvvmproject.ui.detail.DetailViewModel
import com.example.mvvmproject.ui.list.MyListViewModel
import com.example.mvvmproject.ui.viewmodel.MyViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideApiService(): ApiService =
        RetrofitClient.create()

    @Provides
    @Singleton
    fun provideRemoteDataSource(apiService: ApiService) =
        RemoteDataSource(apiService)

    @Provides
    @Singleton
    fun provideMyRepository(remoteDataSource: RemoteDataSource) =
        MyRepository(remoteDataSource)

    @Provides
    @Singleton
    fun provideMyViewModel(repository: MyRepository) =
        MyViewModel(repository)

    @Provides
    @Singleton
    fun provideMyListViewModel(repository: MyRepository) =
        MyListViewModel(repository)

    @Provides
    @Singleton
    fun provideDetailViewModel() =
        DetailViewModel()
}