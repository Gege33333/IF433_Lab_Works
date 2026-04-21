package oop_113652_GeraldFedorian.week09.LatihanDiKelas

fun main(){
    println("===== LIST OF =====")
    var arMhs = listOf("Budi", "susi", "gege")
    println(arMhs)
    println("panjang List ${arMhs.size}")
    println(arMhs[1])
    for(a in arMhs){
        println("Mahasiswa bernama: $a")
    }

    println("==== MUTABLE LIST ====")
    var arAngka = mutableListOf(10,30,40,20,90,100,15)
    println(arAngka)

    //nambah array
    arAngka.add(777)

    //ganti atau replace array
    arAngka[2] = 123

    //hapus array
    arAngka.removeAt(3)

    //view hasil
    println(arAngka)


    println("==== SET OF ====")
    var arUrutan = setOf(20,30,40,20,70,30,10,100)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 ga?" + arUrutan.contains(40))

    println("=== MUTABLE SET OF ===")
    var arMakanan = mutableSetOf("Nasi", "Bakpau", "Mie", "Ayam", "Ayam lagi")
    arMakanan.add("Ketoprak")
    arMakanan.add("Mie")
    arMakanan.remove("Nasi")
    println(arMakanan)

    println("==== MAP OF ===")
    println("\n========= MAP OF =========")
    var arSiswa = mapOf(
        "Andi" to 89,
        "Toni" to 73,
        "Ivander" to 90
    )
    println("banyak data siswa: ${arSiswa.size}")
    println("Nilai si Andi " + arSiswa["Andi"])
    println("semua keys: " + arSiswa.keys)
    println("semua values: " + arSiswa.values)
    println(arSiswa.keys.elementAt(1))
    println(arSiswa)

    println("\n========= MUTABLE MAP =========")
    var arMenu = mutableMapOf(
        "Nasi" to 1000,
        "Ayam" to 2000,
        "Sayur asem" to 1500
    )
    println("Banyak menu: " + arMenu.size)
    arMenu["Nasi"] = 500
    arMenu.remove("Ayam")
    arMenu.put("Udang", 2300)
    println(arMenu)
}