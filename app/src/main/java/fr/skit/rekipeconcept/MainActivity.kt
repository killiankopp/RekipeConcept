package fr.skit.rekipeconcept

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import fr.skit.rekipeconcept.ui.theme.RekipeConceptTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RekipeConceptTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RekipeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
