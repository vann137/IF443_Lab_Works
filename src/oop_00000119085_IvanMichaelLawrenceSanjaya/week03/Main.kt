package oop_00000119085_IvanMichaelLawrenceSanjaya.week03

fun main(){
    val e = Employee("Budi")

    e.salary = -1000 // Balik ke 0
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}