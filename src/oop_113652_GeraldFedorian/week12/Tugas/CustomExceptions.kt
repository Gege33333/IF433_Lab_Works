package oop_113652_GeraldFedorian.week12.Tugas

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")