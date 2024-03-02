package data.preferences


expect class PreferencesStorage {
    fun getString(key: String, defaultValue: String = ""): String
    fun putString(key: String, value: String)
}