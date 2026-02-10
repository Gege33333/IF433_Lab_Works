package oop_113652_GeraldFedorian.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI LIBRARY FINE SYSTEM ---")

    println("Masukkan Nama Buku: ")
    val bookTitle = scanner.nextLine()

    println("Masukkan nama: ")
    val borrower = scanner.next()

    scanner.nextLine()

    print("Pilih Durasi Loan: ")
    val loanDuration = scanner.nextInt()
    scanner.nextLine()
}