package com.example.halostudent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.tugas1.ui.theme.Tugas1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tugas1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ProfileScreen()
                }
            }
        }
    }
}

@Preview()
@Composable
fun ProfileScreen() {
    var text by remember { mutableStateOf("") }
    val namaMahasiswa = "Pieter Christy Yan Yudhistira"

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        verticalArrangement = Arrangement.Top,
    ) {
        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = "Gambar Profil",
            modifier = Modifier
                .size(150.dp),
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