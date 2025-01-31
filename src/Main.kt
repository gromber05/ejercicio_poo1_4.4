
fun main() {
    try {
        val c1 = Coche(null, "nissan", "Juke", 150, "123456A", 5)

        val c2 = Coche("Negro", "", "Focus", 50, "000560C", 4)
        val c3 = Coche("Naranja", "Seat", "Toledo", 120, "000000W", 3)
        val c4 = Coche("Azul", "Volkswagen", "Golf", 150, "654321F", 20)
        val c5 = Coche("Verde", "Peugeot", "205d", 60, "440625N", 4)

        println(c1.toString())
        println(c2.toString())
        println(c3.toString())
        println(c4.toString())
        println(c5.toString())

    } catch (e: Exception) {
        println(e.message)
    }
}