package oop_113652_GeraldFedorian.week02.Tugas1

class Loan(
    val bookTitle:String,
    val borrower:String,
    val loanDuration:Int = 1
) {
    fun calculateFine(loanDuration: Int) : Int{
        if(loanDuration > 3){
            return (loanDuration - 3) * 2000
        } else {
            return 0
        }
    }
}