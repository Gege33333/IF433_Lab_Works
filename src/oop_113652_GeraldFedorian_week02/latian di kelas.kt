package oop_113652_GeraldFedorian_week02

class MyCar(){
    public var warna : String = "merah"
    public var kecepatan:Int = 50

    init{
        if(kecepatan>=70){
            println("sangat cepat")
        } else{
            println("kurang cepat")
        }
    }

    constructor(speed:Int = 0, brake:Double = 1.3){
        kecepatan = speed
        println("ini dari secondary constructor $kecepatan & $brake")
    }

    fun mulai_jalan(){
        println("Kecepatan $warna: 100km/h")
    }
}

fun main(){
    val myCar = MyCar(100, 1.5)
    myCar.mulai_jalan()
    myCar.warna = "abu"
    val qty = 5
    val json = $$"""
        
    

    println("Warna Mobil: ${myCar.warna}")
}

