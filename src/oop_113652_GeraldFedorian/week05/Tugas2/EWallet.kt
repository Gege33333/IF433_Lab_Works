package oop_113652_GeraldFedorian.week05.Tugas2

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance > amount) {
            balance -= amount
            println("Payment berhasil")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }
}