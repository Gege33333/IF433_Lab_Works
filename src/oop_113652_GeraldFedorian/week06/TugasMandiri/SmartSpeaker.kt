package oop_113652_GeraldFedorian.week06.TugasMandiri

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable {
    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }

    override fun turnOn() {
        println("Speaker $name menyala")
    }

    override fun turnOff() {
        println("Speaker $name mati")
    }
}