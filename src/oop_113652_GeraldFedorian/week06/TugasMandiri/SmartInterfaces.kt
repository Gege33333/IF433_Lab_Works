package oop_113652_GeraldFedorian.week06.TugasMandiri

interface SmartDevice{
    abstract fun id(): String
    abstract fun name(): String
}

interface Switchable{
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable{
    abstract fun StartRecord()
    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}