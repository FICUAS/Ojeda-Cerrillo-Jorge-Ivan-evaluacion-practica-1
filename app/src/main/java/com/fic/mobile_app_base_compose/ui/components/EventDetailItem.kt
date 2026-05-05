package com.fic.mobile_app_base_compose.ui.components
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.material3.Icon
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import com.fic.mobile_app_base_compose.R
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.*




@Composable
fun EventDetailItem(icon: ImageVector, text: String){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(
                dimensionResource(id = R.dimen.spacer_medium)
            )
        )
        Spacer(
            modifier = Modifier.width(
                dimensionResource(id = R.dimen.padding_small)
            )
        )
        Text(text = text)
    }
}

