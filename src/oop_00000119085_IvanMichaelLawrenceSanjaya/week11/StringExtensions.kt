package oop_00000119085_IvanMichaelLawrenceSanjaya.week11

fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}