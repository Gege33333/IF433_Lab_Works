package oop_113652_GeraldFedorian.week11.LatihanTerbimbing

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}