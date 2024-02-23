
import androidx.compose.runtime.Composable
import presentation.theme.GeminiTalkerTheme
import presentation.ui.screen.ChatScreen

@Composable
fun App() {
    GeminiTalkerTheme {
        ChatScreen()
    }
}

expect fun getPlatformName(): String