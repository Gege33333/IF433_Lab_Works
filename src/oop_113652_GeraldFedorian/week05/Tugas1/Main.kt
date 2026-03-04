package oop_113652_GeraldFedorian.week05.Tugas1

fun main(){
    val helper = MathHelper()

    println("luas persegi: ${helper.hitungLuas(sisi = 10)}")
    println("luas persegi panjang: ${helper.hitungLuas(panjang = 10, lebar = 20)}")
    println("luas lingkaran: ${helper.hitungLuas(jariJari = 20.0)}")
}