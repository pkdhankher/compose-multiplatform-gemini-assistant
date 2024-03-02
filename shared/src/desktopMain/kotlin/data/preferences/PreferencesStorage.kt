package data.preferences

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.Properties

actual class PreferencesStorage {
    private val properties = Properties()
    private val propertiesFile = File("GeminiTalker.properties")

    init {
        if (propertiesFile.exists()) {
            properties.load(FileInputStream(propertiesFile))
        }
    }

    actual fun getString(key: String, defaultValue: String): String =
        properties.getProperty(key, defaultValue)

    actual fun putString(key: String, value: String) {
        properties.setProperty(key, value)
        properties.store(FileOutputStream(propertiesFile), null)
    }
}