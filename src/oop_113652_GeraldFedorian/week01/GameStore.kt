package oop_113652_GeraldFedorian.week01

fun main() {
    val gameTitle = "Valorant"
    val price = 700000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)
    printReceipt(gameTitle, finalPrice, userNote)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("Game: $title")
    println("Final price: $finalPrice")
    println("Catatan: ${userNote ?: "Tidak ada catatan"}")
}
