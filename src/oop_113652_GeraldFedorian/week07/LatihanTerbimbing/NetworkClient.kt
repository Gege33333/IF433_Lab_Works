package oop_113652_GeraldFedorian.week07.LatihanTerbimbing

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}