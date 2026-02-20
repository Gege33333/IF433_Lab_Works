package oop_113652_GeraldFedorian.week03.latihanDiKelas

open class Karyawan {
    private var nama: String = "blum ada";
    private var gaji: Int = 0;
    protected var namaPacar: String = "jomblo"

    public var umur: Int = 0
        set(value){
            if(value < 0){
                println("masa umur minus")
            } else{
                field = value
            }
        }
        get(){
            return field
        }

    public fun set_nama(namaKamu: String) {
        if(namaKamu.length == 0){
            println("Eh nama gaboleh kosong bang")
        } else{
            this.nama = namaKamu
        }
    }

    public fun get_nama(): String {
        return this.nama
    }

    public fun setGaji(gajiKamu: Int) {
        if(gajiKamu < 0){
            println("masa gaji minus bang")
        } else{
            this.gaji = gajiKamu
        }
    }

    public fun get_gaji(): Int{
        return this.gaji
    }
}

class DataPribadi: Karyawan() {

    fun ambil_data_pacar(): String{
        return this.namaPacar;
    }
}

fun main() {
    var dp = DataPribadi();
    dp.set_nama("Ucok Sipayung")
    dp.setGaji(-1000000)
    dp.umur = -1
    println("Nama Karyawan: ${dp.get_nama()}")
    println("Gaji Karyawan: ${dp.get_gaji()}")
    println("Nama Pacar: ${dp.ambil_data_pacar()}")
    println("Umur: ${dp.umur}")



    /*var kry = Karyawan()
    kry.set_nama("Ucok Sipayung")
    kry.setGaji(-1000)


    println("Halo ${kry.get_nama()} Gaji Kamu ${kry.get_gaji()}")*/
}