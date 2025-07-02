package com.example.jetpacknav3.presentation.screen1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jetpacknav3.presentation.screen2.ScreenTwoState

@Composable
fun ScreenOneContent(
    state: ScreenOneState
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text("Screen Two: ${state.label}")
    }
}