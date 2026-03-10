package oop_113652_GeraldFedorian.week06.TugasMandiri

class SmartHomeHub() {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){

    }

    fun turnOffAllSwitches(){
        for (i in devices){
            when (i){
                is Switchable ->{
                    i.turnOff()
                }
            }
        }
    }
}