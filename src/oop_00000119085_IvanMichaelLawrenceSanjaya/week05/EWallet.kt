package oop_00000119085_IvanMichaelLawrenceSanjaya.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double){
        if(balance > amount) {
            balance -= amount
            println("Pembayaran sukses dengan nominal Rp $amount. Sisa saldo anda adalah Rp $balance")
        } else {
            println("Sisa saldo anda tidak mencukupi.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo anda sekarang: Rp $balance")
    }
}