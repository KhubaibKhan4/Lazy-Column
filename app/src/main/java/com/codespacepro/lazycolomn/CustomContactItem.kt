package com.codespacepro.lazycolomn

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codespacepro.lazycolomn.model.Contact

@Composable
fun CustomContactItem(contact: Contact) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.LightGray)
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Text(
            text = "${contact.firstName}",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${contact.lastName}",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
        Icon(imageVector = Icons.Default.Call, contentDescription = "Call")
        Text(
            text = "+",
            fontSize = MaterialTheme.typography.titleSmall.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${contact.phoneNo}",
            fontSize = MaterialTheme.typography.titleMedium.fontSize,
            fontWeight = FontWeight.Bold
        )

    }
}

@Composable
@Preview
fun CustomContactItemPreview() {
    CustomContactItem(
        Contact(
            id = 0,
            firstName = "Khubaib",
            lastName = "Khan",
            phoneNo = +923047373533
        )
    )
}