package oop_00000119085_IvanMichaelLawrenceSanjaya.week01

fun main() {
    val gameTitle = "The Legend Of Neverlands"
    val price = 300000
    val note: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = note)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(
    title: String,
    finalPrice: Int,
    note: String?
) {
    println("Judul Game : $title")
    println("Final Price : $finalPrice")
    println("Catatan : ${note ?: "Tidak ada catatan"}")
}