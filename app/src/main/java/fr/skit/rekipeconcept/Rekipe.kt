package fr.skit.rekipeconcept

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RekipeScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Cover(imageRes = R.drawable.bg_compose_background)
        Title(name = "Android")
        Description(description = "Lorem Ipsum dolor sit amet")
    }
}

@Composable
fun Cover(@DrawableRes imageRes: Int) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Une image locale",
        modifier = Modifier
            .height(150.dp)
            .fillMaxSize()
            .background(Color.LightGray),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Title(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .padding(8.dp),
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF0D47A1)
    )
}

@Composable
fun Description(description: String) {
    Text(
        text = description,
        modifier = Modifier
            .padding(10.dp),
        color = Color(0xFF0D47A1)
    )
}
