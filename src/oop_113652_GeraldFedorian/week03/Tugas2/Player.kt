package oop_113652_GeraldFedorian.week03.Tugas2

class Player(var username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp/100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP yang ditambahkan harus positif!")
            return
        }

        val levelSebelum = level
        xp += amount
        val levelSesudah = level

        if (levelSesudah > levelSebelum) {
            println("Level Up! Selamat $username naik ke level $levelSesudah")
        }
    }

}