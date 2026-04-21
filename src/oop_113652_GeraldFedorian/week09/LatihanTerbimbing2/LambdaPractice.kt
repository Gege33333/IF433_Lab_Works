package oop_113652_GeraldFedorian.week09.LatihanTerbimbing2

fun main(){
    println("=== TEST LAMBDA ===")
    val sumbLambda = {a: Int, b:Int -> a+b}
    println("Hasil Sum: ${sumbLambda(5,10)}")

    val squareImplicit: (Int) -> Int = {it * it}
    println("Hasil Square: ${squareImplicit(4)}")
}