package oop_113652_GeraldFedorian.week04.latihanDiKelas

class Knd_mobil: Kendaraan(){
    private var jmlBan: Int = 0

    init {
        jmlBan =  4
        println("mobil punya $jmlBan ban")
        super.jalan_maju()
    }
    override fun jalan_maju(){
        println("mobill jalaann")
    }

}