fun main() {
    print("me de numero inteiro: ")
    val numero_1 = readln() ?.toIntOrNull() ?: 0
    print("me de outro numero inteiro:")
    val numero_2 = readln()?.toIntOrNull() ?: 0
    var soma = numero_1 + numero_2
    println("A soma do numero $numero_1 e o $numero_2 é $soma")

}