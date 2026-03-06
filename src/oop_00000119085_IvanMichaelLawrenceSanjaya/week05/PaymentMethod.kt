package oop_00000119085_IvanMichaelLawrenceSanjaya.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}