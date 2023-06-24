package com.example.quizapp.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.quizapp.components.Questions

@Composable
fun QuizAppHome(viewModel: QuestionsViewModel = hiltViewModel()){

    Questions(viewModel)

}