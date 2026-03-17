package oop_113652_GeraldFedorian.week07.LatihanDiKelas

sealed class Hasil {

    data class Sukses(val data: String) : Hasil()
    data class Error(val ex: Exception) : Hasil()
    object loading: Hasil()

    fun handle_response(res: Hasil){
        when(res){
            is Sukses -> { println("Sukses Lempar Data") }
            is Error -> { println("Error ${res.ex}") }
            loading -> { println("Sedang Loading...") }
        }
    }

}