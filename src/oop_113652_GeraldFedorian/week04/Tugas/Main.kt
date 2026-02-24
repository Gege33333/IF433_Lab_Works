package oop_113652_GeraldFedorian.week04.Tugas

fun main(){
    println("---Testing Vehicle---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n---Testing Car---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

}