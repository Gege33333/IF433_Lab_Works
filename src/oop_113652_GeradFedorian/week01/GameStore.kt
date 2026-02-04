package oop_113652_GeradFedorian.week01

fun main() {
    val gameTitle: String = "Valorant"
    val price: Int = 700000

    val finalPrice = calculateDiscount(price)
    printReceipt(gameTitle, finalPrice)
}

fun calculateDiscount(price: Int): Int {
    return if (price > 500000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }
}

fun printReceipt(title: String, finalPrice: Int) {
    println("$title, final price: $finalPrice")
}
