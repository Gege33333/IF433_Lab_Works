package oop_113652_GeraldFedorian.week07.LatihanTerbimbing

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}