package com.example.quizapp.repository

import android.util.Log
import com.example.quizapp.data.DataOrException
import com.example.quizapp.model.QuestionItem
import com.example.quizapp.network.QuestionAPI
import javax.inject.Inject

class QuestionRepository @Inject constructor(
    private val api:QuestionAPI) {


    val dataOrException = DataOrException<ArrayList<QuestionItem>,
            Boolean,
            Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, java.lang.Exception>{
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestion()
            if(dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false


        }catch(exception: Exception){
            dataOrException.e = exception
            Log.d("Exc","getAllQuestions: ${dataOrException.e!!.localizedMessage}")



        }
        return dataOrException

    }




}