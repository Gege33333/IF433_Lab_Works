package oop_113652_GeraldFedorian.week08.BelajarDiKelas

class Alamat(val kota: String?)
class Mahasiswa(val address: Alamat)

fun main(){
    val mhs1 = Mahasiswa(address = Alamat(kota = "Tangerang"))
    val mhs2 = Mahasiswa(address = Alamat(kota = null))

    println("mahasiswa1: ${mhs1.address.kota}")
    println("mahasiswa2: ${mhs2.address.kota}")

    val tetapAlamat = Alamat(kota = "Jakarta")
    val defaultAlamat = tetapAlamat.kota?.let {
        adrs->"Alamatnya adalaahhh $adrs"
    } ?:"Alamat kamu kosong"

    println("Alamat kamu ${tetapAlamat.kota}")
}