package oop_113652_GeraldFedorian.week13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(){
    //baca file cara pertama
    println("===== CARA PERtAMA BACA FILE ======")
    val filesaya = File("src/oop_113652_GeraldFedorian/week13/contohfile.txt")
    val bacaFile = filesaya.readText()
    println(bacaFile)

    //baca file cara ke dua
    println("===== CARA KEDUA BACA FILE =====")
    var fileKamu = File("src/oop_113652_GeraldFedorian/week13/contohfile.txt")
    var bacaFile2 = fileKamu.readLines()
    bacaFile2.forEach() {
        println(it)
    }

    //baca file cara ke tiga
    println("==== CARA KEtiGA BACA FILE =====")
    val br = BufferedReader(FileReader("src/oop_113652_GeraldFedorian/week13/contohfile.txt"))
    var baris:String? = br.readLine()
    while (baris != null) {
        println(baris)
        baris = br.readLine()
    }
    br.close()

    println("===== CARA ke 4 BACA FILE =====")
    val br2 = BufferedReader(FileReader("src/oop_113652_GeraldFedorian/week13/contohfile.txt"))
    br2.use{
            baris -> baris.lineSequence()
        .filter { it.isNotEmpty() }
        .forEach { println(it) }
    }

    println("===== CARA PERTAMA BUAT FILE =====")
    val fileBuat = File("src/oop_113652_GeraldFedorian/week13/fileBuatanSaya.txt")
    fileBuat.writeText("ini adalah baris pertama \nini kedua")

    fileBuat.appendText("\nini baris ketigaaa yang ditambahiinn")

    val contohList = listOf("Nasi Goreng", "Bakpao", "Siomay")
    fileBuat.appendText("\n" + contohList.joinToString("\n"))

    println("\n=== cara nulis isi content ====")
    fileBuat.printWriter().use {
        out ->
        out.println("ini contoh baris pertama pakai printWritter, 20, 3.8")
    }
}
