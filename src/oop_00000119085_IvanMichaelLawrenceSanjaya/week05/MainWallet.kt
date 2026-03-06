package oop_00000119085_IvanMichaelLawrenceSanjaya.week05

fun main() {

    val wallet = EWallet("Ivan", 50_000.0)
    val creditCard = CreditCard("VannShiki", 100_000.0)

    val payments: List<PaymentMethod> = listOf(wallet, creditCard)

    for (payment in payments) {

        payment.processPayment(75000.0)

    }
}