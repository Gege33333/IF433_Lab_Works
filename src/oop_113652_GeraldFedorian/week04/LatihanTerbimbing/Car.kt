package oop_113652_GeraldFedorian.week04.LatihanTerbimbing

open class Car (brand: String, val numberOfDoors: Int): Vehicle(brand){
    fun openTrunk(){
        println("Bagasi Mobil $brand dengan $numberOfDoors pintu dibuka")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand Lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand Menggunakan transmisi gigi untuk menambah kecepatan")
    }
}