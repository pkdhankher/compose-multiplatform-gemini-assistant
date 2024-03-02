package data.preferences

class GeminiTalkerPref(private val preferencesStorage: PreferencesStorage) {
//    private val preferencesStorage: PreferencesStorage = PreferencesStorage()

    fun save(key: String, value: String) {
        preferencesStorage.putString(key, value)
    }

    fun load(key: String, default: String = ""): String? {
        return preferencesStorage.getString(key, default)
    }
}