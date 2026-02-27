package oop_00000119085_IvanMichaelLawrenceSanjaya.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Wuling", 4, 150)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}