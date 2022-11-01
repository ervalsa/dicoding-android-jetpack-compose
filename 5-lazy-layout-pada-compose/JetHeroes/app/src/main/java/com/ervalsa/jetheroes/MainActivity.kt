package com.ervalsa.jetheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.ervalsa.jetheroes.ui.theme.JetHeroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetHeroesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    JetHeroesApp()
                }
            }
        }
    }
}

@Composable
fun HeroListItem(
    name: String,
    photoUrl: String,
    modifier: Modifier = Modifier
) {
     Row(
         verticalAlignment = Alignment.CenterVertically,
         modifier = modifier.clickable {  }
     ) {
         AsyncImage(
             model = photoUrl,
             contentDescription = null,
             contentScale = ContentScale.Crop,
             modifier = Modifier
                 .padding(8.dp)
                 .size(60.dp)
                 .clip(CircleShape)
         )
         Text(
             text = name,
             fontWeight = FontWeight.Medium,
             modifier = Modifier
                 .fillMaxWidth()
                 .weight(1f)
                 .padding(start = 16.dp)
         )
     }
}

@Preview(showBackground = true)
@Composable
fun HeroListItemPreview() {
    JetHeroesTheme {
        HeroListItem(
            name = "H.O.S. Cokroaminoto",
            photoUrl = ""
        )
    }
}