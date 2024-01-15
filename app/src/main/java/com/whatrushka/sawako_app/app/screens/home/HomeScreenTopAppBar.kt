package com.whatrushka.sawako_app.app.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.whatrushka.sawako_app.R
import org.jetbrains.annotations.Async

@Composable
fun HomeScreenTopAppBar(icon: State<String>) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(text = stringResource(id = R.string.bot_name))
        AsyncImage(
            model = icon,
            contentDescription = "",
            placeholder = painterResource(id = R.drawable.icon_placeholder))
    }
}
