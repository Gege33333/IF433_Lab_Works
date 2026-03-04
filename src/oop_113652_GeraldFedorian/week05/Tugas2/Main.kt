package oop_113652_GeraldFedorian.week05.Tugas2

fun main(){
    val eWallet = EWallet(accountName = "Gerald", balance = 50000.0)
    val CC = CreditCard(accountName= "Gerald", limit = 100000.0)

    val metodePayment: List<PaymentMethod> = listOf(eWallet, CC)

    for (i in metodePayment){
        i.processPayment(75000.0)

        when (i) {
            is EWallet -> {
                i.topUp(50000.0)
                i.processPayment(75000.0)
            }

        }
    }
}