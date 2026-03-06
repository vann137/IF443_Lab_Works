package oop_00000119085_IvanMichaelLawrenceSanjaya.week05

class Admin(nama: String): Pegawai(nama){
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data abssensi mahasiswa.")
    }
}