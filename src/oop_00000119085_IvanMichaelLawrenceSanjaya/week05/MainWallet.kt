package oop_00000119085_IvanMichaelLawrenceSanjaya.week05

fun main() {

    val wallet = EWallet("Ivan", 50_000.0)
    val creditCard = CreditCard("VannShiki", 100_000.0)

    val payments: List<PaymentMethod> = listOf(wallet, creditCard)

    for (payment in payments) {

        payment.processPayment(75_000.0)

        if (payment is EWallet) {
            println("Saldo tidak mencukupi, melakukan top up...")
            payment.topUp(50_000.0)
            payment.processPayment(75_000.0)
        }

        println()
    }
}