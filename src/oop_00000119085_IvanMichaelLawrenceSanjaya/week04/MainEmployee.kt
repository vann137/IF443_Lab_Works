package oop_00000119085_IvanMichaelLawrenceSanjaya.week04

fun main(){
    val Manager1 = Manager("Ivan", 50_000_000)
    val Developer1 = Developer("Evan", 1_000_000, "Python")

    Manager1.work()
    Developer1.work()

    println(" ")

    val bonusManager1 = Manager1.calculateBonus()
    println("Manager ${Manager1.name} menerima bonus dengan nominal Rp $bonusManager1.")
    val bonusDeveloper1 = Developer1.calculateBonus()
    println("Developer ${Developer1.name} menerima bonus dengan nominal Rp $bonusDeveloper1.")
}