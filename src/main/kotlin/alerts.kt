import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryAlert(
    message: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,

    ) {
    Alert(message = message, onDismiss = onDismiss, modifier = modifier, alertType = AlertType.Primary)
}

@Composable
fun SecondaryAlert(
    message: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
) {
    Alert(message = message, onDismiss = onDismiss, modifier = modifier, alertType = AlertType.Secondary)
}

@Composable
fun SuccessAlert(
    message: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
) {
    Alert(message = message, onDismiss = onDismiss, modifier = modifier, alertType = AlertType.Success)
}

@Composable
fun DangerAlert(
    message: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
) {
    Alert(message = message, onDismiss = onDismiss, modifier = modifier, alertType = AlertType.Danger)
}

@Composable
fun WarningAlert(
    message: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
) {
    Alert(message = message, onDismiss = onDismiss, modifier = modifier, alertType = AlertType.Warning)
}

@Composable
fun InfoAlert(
    message: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
) {
    Alert(message = message, onDismiss = onDismiss, modifier = modifier, alertType = AlertType.Info)
}


@Composable
private fun Alert(
    message: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
    alertType: AlertType,
) {
    val shape: Shape = RoundedCornerShape(4.dp)
    val contentColor = alertType.contentColor
    val backgroundColor = alertType.backgroundColor
    val borderColor = alertType.borderColor


    Box(
        modifier = modifier.then(
            Modifier.clip(shape)
                .background(backgroundColor)
        )
            .border(0.5.dp, borderColor, shape)
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(message, color = contentColor)
            IconButton(onClick = onDismiss, modifier = Modifier.size(24.dp)) {
                Icon(
                    Icons.Default.Close,
                    contentDescription = "Dismiss",
                    tint = contentColor,
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}