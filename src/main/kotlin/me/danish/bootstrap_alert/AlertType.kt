package me.danish.bootstrap_alert

import androidx.compose.ui.graphics.Color

sealed class AlertType(val contentColor: Color, val backgroundColor: Color, val borderColor: Color) {
    object Primary : AlertType(Color(0XFF004085), Color(0XFFCCE5FF), Color(0XFFB8DAFF))

    object Secondary : AlertType(Color(0xFF383D41), Color(0xFFE2E3E5), Color(0xFFD6D8DB))

    object Success : AlertType(Color(0xFF155724), Color(0xFFD4EDDA), Color(0xFFC3E6CB))

    object Danger : AlertType(Color(0xFF721C24), Color(0xFFF8D7DA), Color(0xFFF5C6CB))

    object Warning : AlertType(Color(0xFF856404), Color(0xFFFFF3CD), Color(0xFFFFEEBA))

    object Info : AlertType(Color(0xFF0C5460), Color(0xFFD1ECF1), Color(0xFFBEE5EB))
}

