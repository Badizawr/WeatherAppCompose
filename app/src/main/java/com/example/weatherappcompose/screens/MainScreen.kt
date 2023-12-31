package com.example.weatherappcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.weatherappcompose.R
import com.example.weatherappcompose.ui.theme.BlueLight

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    Image(
        painter = painterResource(id = R.drawable.weather_bg),
        contentDescription = "img1",
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.5f),
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .alpha(0.75f)
                .background(BlueLight),
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier.padding(top = 8.dp, start = 10.dp),
                        text = "31 December 2023/13:00 ",
                        style = TextStyle(fontSize = 15.sp),
                        color = Color.Black
                    )
                    AsyncImage(
                        model = "https://cdn.weatherapi.com/weather/64x64/night/293.png",
                        contentDescription = "img2",
                        modifier = Modifier
                            .size(45.dp)
                            .padding(top = 2.dp, end = 10.dp)
                    )
                }
                Text(
                    text = "London",
                    style = TextStyle(fontSize = 20.sp),
                    color = Color.Black
                )
                Text(
                    text = "23°C",
                    style = TextStyle(fontSize = 65.sp),
                    color = Color.Black
                )
                Text(
                    text = "Cloudly",
                    style = TextStyle(fontSize = 18.sp),
                    color = Color.Black
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_search),
                            contentDescription = "img3",
                            tint = Color.Black
                        )
                    }
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = "12°C / 23°C",
                        style = TextStyle(fontSize = 16.sp),
                        color = Color.Black
                    )
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_autorenew),
                            contentDescription = "img4",
                            tint = Color.Black
                        )
                    }
                }
            }
        }
    }
}