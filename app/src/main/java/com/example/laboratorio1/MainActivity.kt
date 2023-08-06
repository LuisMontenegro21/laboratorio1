package com.example.laboratorio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.laboratorio1.ui.theme.Laboratorio1Theme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Luis", "Montenegro", "21699", 24.sp)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, lastName: String, carne: String, fontSize : TextUnit) {
    Surface(color = Color.Green) {
        Text(
            text = "Hi, my name is $name $lastName, $carne",
            modifier = Modifier.padding(24.dp),
            fontSize = fontSize
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio1Theme {
        Greeting("Luis", "Montenegro","21699", 24.sp)
    }
}