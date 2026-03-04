package oop_113652_GeraldFedorian.week05.Tugas2

class CreditCard(accountName:String, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit){
            usedAmount += amount
            println("Payment Berhasil")
        } else{
            println("Transaksi Gagal")
        }
    }
}