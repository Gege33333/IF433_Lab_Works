package oop_113652_GeraldFedorian.week03.Tugas1

fun main(){
    val weapon = Weapon("Pedang")

    println("---DAMAGE MINUS---")
    weapon.damage = -50
    println("Damage awal: ${weapon.damage}")
    println("Tier awal: ${weapon.tier}\n")

    println("---GANTI DAMAGE KE 9999---")
    weapon.damage = 9999
    println("Damage Sekarang: ${weapon.damage}")
    println("Tier Sekarang: ${weapon.tier}")


}