package oop_00000119085_IvanMichaelLawrenceSanjaya.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 50, -12.0, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 11, 21.3, "OPEN"),
        TradeLog("DOGEUSDT", "LONG", 21, 8.9, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 4.2, "OPEN")
    )

    // Pipeline 1: Ekstraksi Data Valid (Filter)
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    // Pipeline 2: Memisahkan Winning Trades
    val winningTrades = closedTrades.filter { it.roe > 0 }

    // Pipeline 3: Memisahkan Losing Trades
    val losingTrades = closedTrades.filter { it.roe <= 0 }
}