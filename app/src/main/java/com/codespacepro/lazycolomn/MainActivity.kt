package com.codespacepro.lazycolomn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codespacepro.lazycolomn.model.Person
import com.codespacepro.lazycolomn.repository.ContactRepository
import com.codespacepro.lazycolomn.repository.PersonRepository
import com.codespacepro.lazycolomn.ui.theme.LazyColomnTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColomnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //person Repository
                    val personRepository = PersonRepository()
                    val getAllData = personRepository.getAllData()

                    //contact Repository
                    val contactRepository = ContactRepository()
                    val getContactData = contactRepository.getAllContacts()

                    //sections
                    val sections = listOf(
                        "A",
                        "B",
                        "C",
                        "D",
                        "E",
                        "F",
                        "G",
                        "H",
                        "I",
                        "J",
                        "K",
                        "L",
                        "M",
                        "N",
                        "O",
                        "P"
                    )

                    LazyColumn(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        items(items = getAllData) { person ->
                            CustomItem(person = person)
                        }
                        sections.forEach { section ->
                            stickyHeader {
                                Text(
                                    text = "Section $section",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(
                                            Color.LightGray
                                        )
                                )
                            }
                            items(20) {
                                Text(text = "Item $it from the section $section")

                            }

                        }

                        items(items = getContactData) { contact ->
                            CustomContactItem(contact = contact)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LazyColomnTheme {
        Greeting("Android")
    }
}