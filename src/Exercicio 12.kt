fun main() {
    print("Digite o valor de A: ")
    val a = readLine()?.toDoubleOrNull()

    print("Digite o valor de B: ")
    val b = readLine()?.toDoubleOrNull()

    print("Digite o valor de C: ")
    val c = readLine()?.toDoubleOrNull()

    if (a != null && b != null && c != null) {
        val delta = b * b - 4 * a * c
        println("O valor de Delta é: ${"%.2f".format(delta)}")
    } else {
        println("Valor inválido. Por favor, insira números válidos.")
    }
}
