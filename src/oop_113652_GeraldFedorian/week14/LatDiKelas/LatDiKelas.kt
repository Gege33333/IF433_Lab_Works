package oop_113652_GeraldFedorian.week14.LatDiKelas

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, tugas: Double): Double {
        return (quiz * 0.3) + (tugas * 0.7)
    }

    fun hitung_nilai_akhir(uts: Double, uas: Double, tugas: Double, jnsKur: jenis_kurikulum): Double {
        return jnsKur.hitung_nilai_bobot(uts, uas, tugas)
    }
}

interface jenis_kurikulum{
    fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double
}
class kurikulum_2013: jenis_kurikulum {
    override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double{
        return uts*0.3 + uas*0.4 + tugas*0.3
    }

}
class kurikulum_merdeka: jenis_kurikulum{
    override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return uts*0.2 + uas*0.3 + tugas*0.5
    }
}
class proses_db{
    fun simpan_nama(nim: String, nama: String, nilaiAkhir: Double): String{
        return "KHS $nim nama: $nama nilai: $nilaiAkhir"
    }
    fun load_db(nim: String): String{
        return "berhasil load data $nim"
    }
}

fun main (){
    val khs = proses_khs()
    val db = proses_db()
    val nilaiTugas: Double = khs.hitung_nilai_tugas(83.0, 90.5)
    val nilai1: Double = khs.hitung_nilai_akhir(83.0, 90.5, nilaiTugas, kurikulum_merdeka())
    val nilai2: Double = khs.hitung_nilai_akhir(83.0, 90.5, nilaiTugas, kurikulum_2013())

    val statusSimpan1: String = db.simpan_nama("123456", "erictus", nilai1)
    val statusSimpan2: String = db.simpan_nama("123", "titus", nilai2)

    println(statusSimpan1)
    println(statusSimpan2)
}