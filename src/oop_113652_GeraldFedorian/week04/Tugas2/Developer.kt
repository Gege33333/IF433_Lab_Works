package oop_113652_GeraldFedorian.week04.Tugas2

class Developer(name:String, baseSalary: Int, val programmingLanguage: String):Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }
}