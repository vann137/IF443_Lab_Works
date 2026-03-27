package oop_00000119085_IvanMichaelLawrenceSanjaya.week07

class  NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}