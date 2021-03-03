import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun main() = Window(title = "Bootstrap Alerts") {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        AlertSamples()
    }
}

@Composable
fun AlertSamples() {
    var primaryVisibility by remember { mutableStateOf(true) }
    var secondaryVisibility by remember { mutableStateOf(true) }
    var successVisibility by remember { mutableStateOf(true) }
    var dangerVisibility by remember { mutableStateOf(true) }
    var warningVisibility by remember { mutableStateOf(true) }
    var infoVisibility by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .width(500.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        if (primaryVisibility) {
            PrimaryAlert("This is a primary alert—check it out!", modifier = Modifier.fillMaxWidth()) {
                primaryVisibility = false
            }
        }
        if (secondaryVisibility) {
            SecondaryAlert("This is a secondary alert—check it out!", modifier = Modifier.fillMaxWidth()) {
                secondaryVisibility = false
            }
        }
        if (successVisibility) {
            SuccessAlert("This is a success alert—check it out!", modifier = Modifier.fillMaxWidth()) {
                successVisibility = false
            }
        }
        if (dangerVisibility) {
            DangerAlert("This is a danger alert—check it out!", modifier = Modifier.fillMaxWidth()) {
                dangerVisibility = false
            }
        }
        if (warningVisibility) {
            WarningAlert("This is a warning alert—check it out!", modifier = Modifier.fillMaxWidth()) {
                warningVisibility = false
            }
        }
        if (infoVisibility) {
            InfoAlert("This is a info alert—check it out!") {
                infoVisibility = false
            }
        }
    }
}



