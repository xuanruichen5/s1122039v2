package com.example.s1122039

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.s1122039.ui.theme.S1122039Theme
import androidx.compose.foundation.layout.Arrangement




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1122039Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var horizontalAlignment = Alignment.CenterHorizontally

    Column (modifier = Modifier.fillMaxSize().background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        Text(text = "2024期末上機考(資管二B陳萱芮)\n",)
        Text(text = "遊戲持續時間 0 秒\n",)
        Text(text = "您的成績 0 分\n",)

        Box {
                Modifier
                    .background(Color(0xff95fe95))

                Image(
                    painter = painterResource(id = R.drawable.class_b),
                    contentDescription = "B班",
                    modifier = Modifier
                        .fillMaxSize()
                )
            Button(onClick = {})
            {
                Text(text = "結束App")
            }
            }
        }
    }






@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S1122039Theme {
        Greeting("Android")
    }
}



