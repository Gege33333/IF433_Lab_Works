package oop_113652_GeraldFedorian.week08.BelajarDiKelas

fun main(){
    val nama: String? = "Gerald"

    try{
        println("hai $nama")
        println("${nama!!.uppercase()}")
    } catch (e: NullPointerException){
        println("ada error excception, ini pesan errornya ${e.message}")
    }

    val mixedData: List<Any?> = listOf(1, "Budi", 10, "Online", null)
    for(item in mixedData){
        val hasil = item as? String
        if(hasil != null){println(item)}
    }
}