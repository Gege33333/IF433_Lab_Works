package oop_113652_GeraldFedorian.week02.Tugas2

import java.util.Scanner
import kotlin.random.Random

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base damage Hero: ")
    val baseDamage = scanner.nextLine().toInt()

    val hero = Hero(heroName, baseDamage)

    var enemyHp = 100

    println("=== PERTARUNGAN DIMULAI ===")
    println("HP Hero: ${hero.hp}")
    println("HP Musuh: $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0

                println("HP Musuh tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = Random.nextInt(10, 21)
                    println("Musuh menyerang balik! Damage: $enemyDamage")
                    hero.takeDamage(enemyDamage)
                    println("HP Hero tersisa: ${hero.hp}")
                }
            }

            2 -> {
                println("Hero memilih kabur!")
                break
            }

            else -> {
                println("Pilihan tidak valid!")
            }
        }
    }

    println("=== Pertarungan Selesai ===")
    when {
        hero.isAlive() && enemyHp <= 0 -> println("Hero MENANG!")
        !hero.isAlive() && enemyHp > 0 -> println("Musuh MENANG!")
        else -> println("Pertarungan dihentikan.")
    }

    scanner.close()
}