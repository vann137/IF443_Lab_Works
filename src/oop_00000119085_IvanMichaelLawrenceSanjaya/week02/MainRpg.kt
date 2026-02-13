package oop_00000119085_IvanMichaelLawrenceSanjaya.week02

import java.util.Scanner
import kotlin.random.Random

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Damage Hero: ")
    val heroDamage = scanner.nextInt()

    scanner.nextLine()

    val hero = Hero(nama = heroName, baseDamage = heroDamage)

    // Musuh
    var enemyHp = 100

    while(hero.isAlive() && enemyHp > 0){
        println("\n--- Tampilan Menu ---")
        println("1. Serang")
        println("2. Kabur")
        println("Pilih Skill: ")
        var pilihan = scanner.nextInt()
        scanner.nextLine()

        if(pilihan == 1){
            enemyHp -= hero.baseDamage.toInt()
            hero.attack("Musuh")
            println("Sisa HP Musuh yang diserang: $enemyHp")

            if (enemyHp > 0){
                val enemyDamage = Random.nextInt( from = 10, 20)
                hero.takeDamage(enemyDamage)
                println("Musuh membalas dengan damage: $enemyDamage dan sisa HP Hero: ${hero.hp}")
            }
        } else if (pilihan == 2){
            break
        }
    }

    if(hero.isAlive() && enemyHp == 0){
        print("${hero.nama} Menang")
    } else if (!hero.isAlive()) {
        println("Musuh Menang!")
    } else{
        println("Pertarungan Berhenti.")
    }
}