package oop_113652_GeraldFedorian.week03.Tugas

class Employee {
    var salary: Int = 0
        set(value) {
            if(value <0){
                println("Error: agji tidak boleh negatif")
                field = 0
            } else{
                field = value
            }
        }
}