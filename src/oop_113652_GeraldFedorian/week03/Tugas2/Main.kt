package oop_113652_GeraldFedorian.week03.Tugas2

fun main(){
    val player = Player("Gerald")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}