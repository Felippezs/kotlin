fun main() {
    print("digite um valor:")
    val numero = readln() ?. toDouble() ?: 0.0

    val dobro = numero * 2
    val terça = numero / 3

    println("o dobro do $numero é $dobro e a terça parte é $terça")
}