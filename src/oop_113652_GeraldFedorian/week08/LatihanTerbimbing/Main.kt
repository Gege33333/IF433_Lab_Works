package oop_113652_GeraldFedorian.week08.LatihanTerbimbing

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:"Kota Tidak Diketahui"
    println("Tujuan Pengiriman: $destination")
}