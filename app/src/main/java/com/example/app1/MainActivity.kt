package com.example.app1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app1.ui.theme.App1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        GreetingList(
                            data=listOf("Android","Kotlin","Jetpack","XML","Java")
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun GreetingList(data: List<String>){

    LazyColumn {
        items(data) {
            item ->
            Greeting(item)
        }
    }

}



@Composable
fun Greeting(name: String) {

    Row(verticalAlignment = Alignment.CenterVertically) {

        Column{
            Image(
                painter = painterResource(id = R.drawable.fotolinkedin),
                contentDescription = null,
                modifier = Modifier.width(200.dp)
            )

            Column(verticalArrangement = Arrangement.Center) {
                Text("Nombre: $name ")
                Text("Matricula: A00833841")
                Text("Datos sobre mi: ")
                Text("Me gusta leer, jugar videojuegos y salir con mis amigos.")
                Text("Estoy aprendiendo a programar para Android y a tocar el piano.")


            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    App1Theme {
        Greeting("Adrian Cavazos")
    }
}