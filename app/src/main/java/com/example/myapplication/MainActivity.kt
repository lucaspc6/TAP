package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                }

                App()
            }
        }
    }
}

@Composable
fun App(){
    Column (
        Modifier
            .background(Color.Black)
    ){
        Row (
            Modifier
                .padding(20.dp)
        ){

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Text(
                text = "App Database",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                onValueChange = {},
                label = { Text("Nome:")}
            )
        }

        Row (
            Modifier
                .padding(20.dp)
        ){

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                onValueChange = {},
                label = { Text("Telefone:")}
            )
        }

        Row (
            Modifier
                .padding(20.dp)
        ){

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
           Button(onClick = {

           }) {
               Text("Cadastrar")
           }
        }

        Row (
            Modifier
                .padding(20.dp)
        ){

        }





    }
}

@Preview
@Composable
fun AppPreview(){
    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        }
        App()
    }
}