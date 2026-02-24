package oop_113652_GeraldFedorian.week04.Tugas2

fun main(){
    val Manager = Manager("Alto", 100000)
    val Developer = Developer("Nadin", 200000, "UlarPython")

    Manager.work()
    println("${Manager.name} bonus lu ${Manager.calculateBonus()}\n")

    Developer.work()
    println("${Developer.name} bonus lu ${Developer.calculateBonus()}")
}