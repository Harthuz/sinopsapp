package com.example.paginafilme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.paginafilme.data.Datasource
import com.example.paginafilme.ui.theme.PaginaFIlmeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaginaFIlmeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF0B2433)
                ) {
                    Detalhes()
                }
            }
        }
    }
}

@Composable
fun Detalhes() {
    Column {
        AppHeader()
        MovieDetails()
    }
}

@Composable
fun AppHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "SINOPSAPP",
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            ),
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun MovieDetails() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.guerracivil),
                    contentDescription = "Imagem do Filme",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(height = 200.dp, width = 138.dp)
                        .border(width = 2.dp, color = Color.White)
                )
                Spacer(modifier = Modifier.height(8.dp))
                ActorList()
            }
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = "Guerra Civil",
                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                Text(
                    text = "Dirigido por: Alex Garland",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White
                )
                Text(
                    text = "Roteirizado por: Alex Garland",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White
                )
                Text(
                    text = "Sinopse:",
                    style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                    color = Color.White,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text = stringResource(R.string.sinopse),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White,
                )
            }
        }
    }
}

@Composable
fun ActorList() {
    val actorData = Datasource().loadActors()
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(top = 8.dp)
    ) {
        items(actorData) { (actorImage, actorName) ->
            ActorItem(imageId = actorImage, name = actorName)
        }
    }
}

@Composable
fun ActorItem(imageId: Int, name: String) {
    Box(
        modifier = Modifier
            .background(Color.White)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .border(width = 1.dp, color = Color.White)
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "Imagem do Ator",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(height = 138.dp, width = 138.dp)
                    .border(width = 1.dp, color = Color.White)
            )
            Text(
                text = name,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PaginaFIlmeTheme {
        Detalhes()
    }
}
