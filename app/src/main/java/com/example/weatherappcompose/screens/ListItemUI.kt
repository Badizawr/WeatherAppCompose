package com.example.weatherappcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.weatherappcompose.data.WeatherModel
import com.example.weatherappcompose.ui.theme.BlueLight

@Composable
fun ListItemUI(item: WeatherModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .alpha(0.75f)
            .padding(top = 3.dp)
            .background(BlueLight),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.padding(
                    start = 8.dp,
                    top = 5.dp,
                    bottom = 5.dp
                ),
            ) {
                Text(
                    text = item.time,
                    style = TextStyle(fontSize = 15.sp),
                    color = Color.Black
                )
                Text(
                    text = "${item.condition}",
                    style = TextStyle(fontSize = 15.sp),
                    color = Color.Black
                )
            }
            Text(
                text = item.currentTemp.ifEmpty { "${item.minTemp.toFloat().toInt()}°C" +
                        "/ ${item.maxTemp.toFloat().toInt()}°C"},
                style = TextStyle(fontSize = 25.sp),
                color = Color.Black
            )
            AsyncImage(
                model = "https:${item.icon}",
                contentDescription = "img5",
                modifier = Modifier
                    .size(45.dp)
                    .padding(top = 2.dp, end = 10.dp)
            )
        }

    }
}