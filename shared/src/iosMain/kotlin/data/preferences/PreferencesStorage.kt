package data.preferences

import platform.Foundation.NSUserDefaults

actual class PreferencesStorage {
    private val userDefaults = NSUserDefaults.standardUserDefaults

    actual fun getString(key: String, defaultValue: String): String =
        userDefaults.stringForKey(key) ?: defaultValue

    actual fun putString(key: String, value: String) {
        userDefaults.setObject(value, forKey = key)
    }
}