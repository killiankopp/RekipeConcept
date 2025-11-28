package fr.skit.rekipeconcept

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.skit.rekipeconcept.ui.theme.RekipeConceptTheme


var fake_text = "Lorem Ipsum  sit , porem  dolor sit amet porem Ipsum  sit amet porem Ipsum dolor sit  porem Ipsum dolor sit amet porem Ipsum dolor sit amet"

@Composable
fun RekipeScreen(
    modifier: Modifier = Modifier,
    title: String = "Poulet Tikka Massalla",
    description: String = fake_text,
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

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "A")
            Text(text = "B")
            Text(text = "C")
            Text(text = "D")
            Text(text = "E")
            Text(text = "F")
        }

        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "TTT")
            Text(text = "FR")
            Text(text = "€€€")
        }

        Spacer(Modifier.height(16.dp))

        Title(text = title)

        Spacer(Modifier.height(8.dp))

        Description(text = description)

        Spacer(Modifier.height(8.dp))

        Section(text = "Ingrédients")

        Spacer(Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "X personnes")
            Text(text = "- 8 +")
        }

        Spacer(Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Text(
                text = "250g",
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "farine",
                modifier = Modifier.weight(2f)
            )
        }

        Spacer(Modifier.height(8.dp))

        Section(text = "Méthodes")

        Spacer(Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Text(
                text = "1",
                modifier = Modifier.weight(0.2f)
            )
            Text(
                text = fake_text,
                modifier = Modifier.weight(2f)
            )
        }
    }
}

@Composable
fun Cover(@DrawableRes imageRes: Int, modifier: Modifier = Modifier) {
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

@Composable
fun Section(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        style = MaterialTheme.typography.headlineSmall,
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(horizontal = 10.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun RekipePreview() {
    RekipeConceptTheme {
        RekipeScreen()
    }
}
