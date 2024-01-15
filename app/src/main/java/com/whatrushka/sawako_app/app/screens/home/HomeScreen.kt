package com.whatrushka.sawako_app.app.screens.home

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    val icon = remember {
        mutableStateOf("https://i.pinimg.com/originals/03/8e/38/038e38710d53a579ec5a024c2e4d3994.jpg") }

    Scaffold(
        topBar = { HomeScreenTopAppBar(icon) }
    ) {
        Text(text = "hello")
    }
}

