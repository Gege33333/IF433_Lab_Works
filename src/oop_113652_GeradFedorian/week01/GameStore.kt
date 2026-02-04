package oop_113652_GeradFedorian.week01

fun main(){
    val gameTitle: String = "Valorant"
    var price: Int = 300000

    val discount = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int {
    return if (price > 500000) {
        price * 20 / 100
    } else {
        price * 10 / 100
    }
}