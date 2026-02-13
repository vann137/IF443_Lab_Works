package oop_00000119085_IvanMichaelLawrenceSanjaya.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    print("Library Fine System")

    print("Masukkan Judul Buku: ")
    val judul = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val nama = scanner.nextLine()

    print("Lama Buku yang Dipinjam: ")
    var durasi = scanner.nextInt()

    scanner.nextLine()

    if(durasi < 0){
        println("Durasi hari kurang dari 0, akan di ubah menjadi 1")
        durasi = 1
    }

    val loan = Loan(judul, nama, loanDuration = durasi)

    val denda = loan.calculateFine()

    println("\n --- Detail Peminjaman ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Nama Peminjam: ${loan.borrower}")
    println("Durasi Peminjasman: ${loan.loanDuration}")
    println("Denda: Rp. ${denda}")
}