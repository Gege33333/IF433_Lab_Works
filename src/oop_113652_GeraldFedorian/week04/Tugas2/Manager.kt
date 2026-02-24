package oop_113652_GeraldFedorian.week04.Tugas2

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang memimpin rapat divisi")
    }

    override fun calculateBonus(): Double {
        return super.calculateBonus() + 500000
    }
}