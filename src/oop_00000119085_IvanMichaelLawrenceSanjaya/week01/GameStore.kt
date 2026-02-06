package oop_00000119085_IvanMichaelLawrenceSanjaya.week01

fun main() {
    val gameTitle = "The Legend Of Neverlands"
    val price = 300000

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(
    title: String,
    finalPrice: Int
) {
    println("Judul Game : $title")
    println("Final Price : $finalPrice")
}