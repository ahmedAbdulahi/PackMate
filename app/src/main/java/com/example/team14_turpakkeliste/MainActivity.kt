package com.example.team14_turpakkeliste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.team14_turpakkeliste.data.showJsonAsList
import com.example.team14_turpakkeliste.ui.MapScreen
import com.example.team14_turpakkeliste.ui.theme.Team14TurPakkeListeTheme

//The activity needs to be a subclass of ComponentActivity; AppCompatActivity
//In order for google maps to function, according to the current implementation.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Team14TurPakkeListeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Hallaballa")
                    val view = viewModel()
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
    Team14TurPakkeListeTheme {
        Greeting("Android")
    }
}