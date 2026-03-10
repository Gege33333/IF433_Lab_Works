package oop_113652_GeraldFedorian.week06.TugasMandiri

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable{
    override fun turnOn() {
        println("Speaker $name menyala")
        StartRecord()
    }

    override fun turnOff() {
        println("Speaker $name mati")
    }

    override fun StartRecord() {
        println("CCTV mulai recording")
    }
}