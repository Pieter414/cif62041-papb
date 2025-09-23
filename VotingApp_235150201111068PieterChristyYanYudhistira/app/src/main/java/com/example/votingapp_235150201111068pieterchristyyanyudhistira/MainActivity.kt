package com.example.votingapp_235150201111068pieterchristyyanyudhistira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.res.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.ui.tooling.preview.Preview
import com.example.votingapp_235150201111068pieterchristyyanyudhistira.ui.theme.VotingApp_235150201111068PieterChristyYanYudhistiraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VotingApp_235150201111068PieterChristyYanYudhistiraTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    GreetingPreview()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val namaMahasiswa = name

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = "Gambar Profil",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Halo, $namaMahasiswa!",
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Selamat datang di aplikasi saya!",
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 16.sp,
            color = Color.Gray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VotingApp_235150201111068PieterChristyYanYudhistiraTheme {
        Greeting("Android")
    }
}