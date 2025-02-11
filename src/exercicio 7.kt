fun main() {
    print("me de um numero: ")
    val numero = readln() ?. toIntOrNull()?: 0
    val antecessor = numero - 1
    val sucessor = numero + 1
    println("O antecessor de $numero é $antecessor e o sucessor é $sucessor")
}