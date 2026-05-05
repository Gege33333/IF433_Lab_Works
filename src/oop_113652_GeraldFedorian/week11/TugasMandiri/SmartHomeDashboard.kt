package oop_113652_GeraldFedorian.week11.TugasMandiri

fun main() {
    println("=== SMART HOME DASHBOARD ===")
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

}