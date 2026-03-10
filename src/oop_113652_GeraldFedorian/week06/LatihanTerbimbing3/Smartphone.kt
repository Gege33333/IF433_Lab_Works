package oop_113652_GeraldFedorian.week06.LatihanTerbimbing3

class Smartphone: Camera, Phone {
    override fun tunrOn() {
        super<Camera>.tunrOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting")
    }
}