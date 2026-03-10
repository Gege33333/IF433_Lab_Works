package oop_113652_GeraldFedorian.week06.TugasMandiri

class SmartLamp(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name menyala")
    }

    override fun turnOff() {
        println("Lampu $name mati")
    }
}