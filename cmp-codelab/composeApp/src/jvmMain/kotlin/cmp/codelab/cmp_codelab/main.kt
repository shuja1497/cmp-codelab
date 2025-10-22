package cmp.codelab.cmp_codelab

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "cmp_codelab",
    ) {
        App()
    }
}