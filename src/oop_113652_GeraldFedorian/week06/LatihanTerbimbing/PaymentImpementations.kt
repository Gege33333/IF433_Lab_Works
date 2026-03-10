package oop_113652_GeraldFedorian.week06.LatihanTerbimbing

class Gopay: PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")
    }
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting Bank For Rp$amount")
    }
}