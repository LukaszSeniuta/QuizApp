package com.example.quizapp.network

import com.example.quizapp.model.Question
import retrofit2.http.GET
import javax.inject.Singleton


@Singleton
interface QuestionAPI {

    @GET("world.json")
    suspend fun getAllQuestion(): Question

}