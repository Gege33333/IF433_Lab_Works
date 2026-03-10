package oop_113652_GeraldFedorian.week06.TugasMandiri

class SmartHomeHub() {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){
        devices.add(device)
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

    fun activateSecurityMode(){
        for (i in devices){
            when (i){
                is Recordable ->{
                    i.StartRecord()
                }
                is SmartSpeaker->{
                    i.playMusic("Sirine Peringatan")
                }
            }
        }
    }
}