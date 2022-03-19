package com.osisupermoses.canvas_in_compose

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.osisupermoses.canvas_in_compose.ui.theme.Canvas_in_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Canvas_in_ComposeTheme {
                // Alternatively..
                // This draws behind the Box composable
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .drawBehind {
//
//                        }
//                ) {
//
//                }
                Column {
                    InstagramIcon()
                    Spacer(modifier = Modifier.height(10.dp))
                    FacebookIcon()
                    Spacer(modifier = Modifier.height(10.dp))
                    MessengerIcon()
                    Spacer(modifier = Modifier.height(10.dp))
                    GetGooglePhotosIcon()
                    Spacer(modifier = Modifier.height(10.dp))
                    GetWeatherApp()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Canvas_in_ComposeTheme {
        Greeting("Android")
    }
}