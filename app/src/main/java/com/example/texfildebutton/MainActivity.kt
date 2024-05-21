package com.example.texfildebutton

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.texfildebutton.ui.theme.TEXFILDEBUTTONTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TEXFILDEBUTTONTheme {
                // A surface container using the 'background' color from the theme
       App()
                }
            }
        }
    }

@Composable
private fun App() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    )
    {
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAligment = Alignment.CenterHorizontally
        ) {
            Greeting("JetPack")
            ActionButton(
                text = "Debug",
                buttonColors = DebugButtonColors(),
                modifier = Modifier.fillMaxSize(0.5f)
            ){
                Log.d(TAG, "App: Clicou em DEBUG!")
            }
            ActionButton(
                text = "Info",
                buttonColors = InfoButtonColors(),
                modifier = Modifier.fillMaxSize(0.5f)
            ){
                Log.i(TAG, "App: Clicou em INFO")
            }
            ActionButton(
                text = "Error",
            )
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TEXFILDEBUTTONTheme {
        Greeting("Android")
    }
}