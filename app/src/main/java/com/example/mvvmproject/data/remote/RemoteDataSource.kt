package com.example.mvvmproject.data.remote

import com.example.mvvmproject.data.model.Problem

class RemoteDataSource(private val apiService: ApiService) {

    suspend fun getProblems(): List<Problem> {
        val response = apiService.getProblems()
        return response.problems
    }
}
