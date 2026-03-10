package oop_113652_GeraldFedorian.week06.LatihanTerbimbing

class Smartwatch: Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun ChargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}