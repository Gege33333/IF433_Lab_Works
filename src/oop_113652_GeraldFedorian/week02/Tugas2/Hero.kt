package oop_113652_GeraldFedorian.week02.Tugas2

class Hero(
    var name: String,
    var baseDamage: Int,
    var hp: Int = 100

){
    fun attack(targetName: String){
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if (hp<0){
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}