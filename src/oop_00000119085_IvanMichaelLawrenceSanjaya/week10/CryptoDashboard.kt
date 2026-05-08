package oop_00000119085_IvanMichaelLawrenceSanjaya.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.43))
    coinRepo.add(Coin("ETH", 5.17))
    coinRepo.add(Coin("USDT", 2350.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Network Status: ${response.status}")
    println("--- Asset Portfolio ---")
    response.data.forEach { coin ->
        println("Aset: ${coin.name}\t| Saldo: ${coin.balance}")
    }
}