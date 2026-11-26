package com.awet.bingo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var language by remember { mutableStateOf("አማርኛ") }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF101010))
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "AWET BINGO",
                    color = Color(0xFFFFD700),
                    fontSize = 34.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(Modifier.height(16.dp))

                Text(
                    "Welcome to AWET BINGO",
                    color = Color.White,
                    fontSize = 18.sp
                )

                Spacer(Modifier.height(30.dp))

                Text("ቋንቋ ምረጥ / Choose Language",
                    color = Color(0xFFFFD700))

                Spacer(Modifier.height(12.dp))

                listOf("አማርኛ", "ትግርኛ", "English").forEach {
                    Button(
                        onClick = { language = it },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFB8860B)
                        )
                    ) {
                        Text(it, color = Color.Black)
                    }
                    Spacer(Modifier.height(8.dp))
                }

                Text(
                    "Selected: $language",
                    color = Color.White
                )
            }
        }
    }
}
