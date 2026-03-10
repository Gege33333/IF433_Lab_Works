package oop_113652_GeraldFedorian.week06.TugasMandiri

fun main(){
    val lamp = SmartLamp("1" ,"Ruang Tamu")
    val speaker = SmartSpeaker("1", "Google Nest Dapur")
    val cctv = SmartCCTV("1", "Ezviz Garasi")

    val homeHub = SmartHomeHub()
    homeHub.addDevice(speaker)
    homeHub.addDevice(lamp)
    homeHub.addDevice(cctv)

    homeHub.activateSecurityMode()
    homeHub.turnOffAllSwitches()
}