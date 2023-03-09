package com.example.mvvmproject.data.remote

import com.example.mvvmproject.data.model.Problem
import retrofit2.http.GET

interface ApiService {

    @GET("mocky.json")
    suspend fun getProblems(): ProblemResponse

    data class ProblemResponse(
        val problems: List<Problem>
    )
}
