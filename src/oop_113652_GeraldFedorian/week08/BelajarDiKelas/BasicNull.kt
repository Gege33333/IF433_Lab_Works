package oop_113652_GeraldFedorian.week08.BelajarDiKelas

class profile_page (val idprofile: String, val statusOnline: String){
    fun ganti_foto (fileFoto: String){
        println("$fileFoto")
    }
}

fun main(){
    var nama: String? = "Gerald"
    nama = null
    println("nama kamu $nama")

    val profile = profile_page("12345", "Online")
    println("id: ${profile.idprofile}, status: ${profile.statusOnline}")

    profile.ganti_foto("foto.jpg")

}