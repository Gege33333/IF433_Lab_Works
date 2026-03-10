package oop_113652_GeraldFedorian.week06.LatihanTerbimbing1

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}