package oop_00000119085_IvanMichaelLawrenceSanjaya.week10

interface INamedEntity {
    val name: String
}

data class Coin(override val name: String, val balance: Double): INamedEntity
data class Transaction(val id: String, val amount: Double)