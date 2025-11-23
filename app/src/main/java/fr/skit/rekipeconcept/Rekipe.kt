package fr.skit.rekipeconcept

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.skit.rekipeconcept.ui.theme.RekipeConceptTheme

@Composable
fun RekipeScreen(
    modifier: Modifier = Modifier,
    title: String = "Android",
    description: String = "Lorem Ipsum dolor sit amet",
    @DrawableRes imageRes: Int = R.drawable.bg_compose_background
) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Cover(imageRes = imageRes, modifier = Modifier
            .fillMaxWidth()
            .height(180.dp))

        Spacer(Modifier.height(16.dp))

        Title(text = title)

        Spacer(Modifier.height(8.dp))

        Description(text = description)
    }
}

@Composable
fun Cover(@DrawableRes imageRes: Int, modifier: Modifier = Modifier) {
    // Keep this composable very small and stateless – caller decides size via modifier.
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Image de couverture",
        modifier = modifier,
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Title(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        style = MaterialTheme.typography.headlineSmall,
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(horizontal = 10.dp)
    )
}

@Composable
fun Description(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        color = MaterialTheme.colorScheme.onBackground,
        modifier = modifier.padding(horizontal = 20.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun RekipePreview() {
    RekipeConceptTheme {
        RekipeScreen()
    }
}
