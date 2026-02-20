package oop_113652_GeraldFedorian.week03.Tugas1

class Weapon(var name: String) {
    var damage: Int = 0
        set(value){
            if(value<0){
                println("Damage tidak boleh negatif")

            }
            else if (value > 1000){
                println("Damage terlalu besar")
                field = 1000
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

