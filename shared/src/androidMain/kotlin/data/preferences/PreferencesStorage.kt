package data.preferences

import android.content.Context
import android.content.SharedPreferences
import data.preferences.PrefKey.GEMINI_TALKER_PREF

actual class PreferencesStorage(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(GEMINI_TALKER_PREF, Context.MODE_PRIVATE)

    actual fun getString(key: String, defaultValue: String): String =
        sharedPreferences.getString(key, defaultValue) ?: defaultValue

    actual fun putString(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }
}