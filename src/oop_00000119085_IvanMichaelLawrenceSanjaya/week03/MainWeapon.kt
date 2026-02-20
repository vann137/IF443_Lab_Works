package oop_00000119085_IvanMichaelLawrenceSanjaya.week03

fun main() {

    val weapon = Weapon("Yamato", 100)

    weapon.damage = -50

    weapon.damage = 9999

    println("Nama Weapon: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}
