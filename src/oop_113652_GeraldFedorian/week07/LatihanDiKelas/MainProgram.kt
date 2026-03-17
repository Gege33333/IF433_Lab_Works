package oop_113652_GeraldFedorian.week07.LatihanDiKelas

fun main(){
    Koneksi.kon = "http://localhost:3000"
    println("link ${Koneksi.kon}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(10, 20)
    Hitungan.kali(3, 4)
    println("Nama Matkul: ${Hitungan.namaMtk}")

    Hitungan.buat_data("User")

    val dt = SaveData(
        namaChar = "Mario",
        skor = 10,
        highscore = 30,
        currentLevel = 5
    )

    val dtCopy = dt.copy(namaChar = "Luigi")
    println("nama Char: ${dtCopy.namaChar}")


    println("=== class ENUM ===")
    val arh = Arah.Atas
    println(arh.tampilkan_isi_param());

    println("--- SEALED CLASS ---")
    val hsl: Hasil = Hasil.Sukses("Berhasil simpan")
    hsl.handle_response(hsl)
}