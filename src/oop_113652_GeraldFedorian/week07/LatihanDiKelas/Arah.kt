package oop_113652_GeraldFedorian.week07.LatihanDiKelas

enum class Arah(val pentunjuk: String) {
    Atas(pentunjuk = "naik"),
    Bawah(pentunjuk = "turun"),
    Kiri(pentunjuk = "belok"),
    Kanan(pentunjuk = "mengsong");

    fun tampilkan_isi_param(){
        println("arah ke $pentunjuk")
    }
}