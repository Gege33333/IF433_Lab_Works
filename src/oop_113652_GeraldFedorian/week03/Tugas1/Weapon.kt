package oop_113652_GeraldFedorian.week03.Tugas1

class Weapon(name: String, damage: Int) {
    var damage: Int = damage
        set(value){
            if(value<0){
                println("Damage tidak boleh negatif")
                return
            }
            else if (value > 1000){
                println("Damage terlalu besar")
            } else{
                value
            }
        }

    val tier: String
        get() = when{
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}

