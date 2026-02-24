package oop_113652_GeraldFedorian.week04.Tugas2

open class Employee(val name: String, val baseSalary: Int) {
    open fun work(){
        println("$name sedang bekerja")
    }

    open fun calculateBonus(): Double {
        return baseSalary * 0.1
    }

}