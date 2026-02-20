package oop_00000119085_IvanMichaelLawrenceSanjaya.week03

fun main(){
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // Program bakal meledak
}