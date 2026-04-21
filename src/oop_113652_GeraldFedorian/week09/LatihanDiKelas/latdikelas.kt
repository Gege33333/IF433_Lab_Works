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
}