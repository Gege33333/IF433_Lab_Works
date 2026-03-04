package oop_113652_GeraldFedorian.week05.Tugas2

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}