package oop_00000119085_IvanMichaelLawrenceSanjaya.week05

fun main(){
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(4)
    val luasPersegiPanjang = math.hitungLuas(3, 5)
    val luasLingkaran = math.hitungLuas(5.5)

    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")
}