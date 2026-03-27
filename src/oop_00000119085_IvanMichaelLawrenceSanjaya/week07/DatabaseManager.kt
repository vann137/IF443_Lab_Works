package oop_00000119085_IvanMichaelLawrenceSanjaya.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}