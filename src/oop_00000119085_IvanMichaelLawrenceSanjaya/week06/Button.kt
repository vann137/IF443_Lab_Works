package oop_00000119085_IvanMichaelLawrenceSanjaya.week06

class Button(override val name: String): Clickable{
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}