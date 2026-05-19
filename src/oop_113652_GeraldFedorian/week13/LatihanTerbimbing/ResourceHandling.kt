package oop_113652_GeraldFedorian.week13.LatihanTerbimbing

import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")

    val writer = unsafeFile.printWriter()
    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")
    writer.close()
    println("Proses penulisan unsafe selesai.")
}