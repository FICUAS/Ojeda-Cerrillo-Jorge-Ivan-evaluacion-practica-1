package com.fic.mobile_app_base_compose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.fic.mobile_app_base_compose.R
import androidx.compose.ui.unit.dp
import com.fic.mobile_app_base_compose.ui.components.EventDetailItem


@Composable
fun EventCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.padding_main)),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(id = R.dimen.img_height))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.fnaf),
                    contentDescription = "FNAF Banner",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                Surface(
                    color = Color.Red,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(dimensionResource(id = R.dimen.padding_small)),
                    shape = MaterialTheme.shapes.small
                ) {
                    Text(
                        text = stringResource(id = R.string.label_badge),
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelSmall
                    )

                }
            }
            Column(
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_main))
            ) {
                //la categorias
                Text(
                    text = stringResource(id = R.string.cat_evento),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                //el titulo

                Text(
                    text = stringResource(id = R.string.title_evento),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 4.dp)
                )
                // organizador
                Text(
                    text = stringResource(id = R.string.org_evento),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_medium)))

                EventDetailItem(
                    icon = Icons.Default.DateRange,
                    text = stringResource(id = R.string.Pay_evento)
                )

                Spacer(modifier = Modifier.height(4.dp)) // Un espacio pequeño entre fecha y precio
                EventDetailItem(
                    icon = Icons.Default.LocationOn,
                    text = stringResource(id = R.string.Pay_evento)
                )

                //barra de acciones
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = {}) {
                        Text("Comprar")
                    }

                    Button(onClick = {}) {
                        Text("Compartir")
                    }
                }
            }
        }
    }
}

