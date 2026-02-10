package oop_113652_GeraldFedorian.week02.Tugas1

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
    var loanDuration = scanner.nextInt()
    scanner.nextLine()

    if (loanDuration < 0 ){
        loanDuration = 1;
        val l1 = Loan(bookTitle, borrower, loanDuration)
    } else {
        val l1 = Loan(bookTitle, borrower, loanDuration)
    }

}