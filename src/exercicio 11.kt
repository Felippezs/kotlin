fun main() {
    print("Digite a largura da parede (em metros): ")
    val largura = readLine()?.toDoubleOrNull()

    print("Digite a altura da parede (em metros): ")
    val altura = readLine()?.toDoubleOrNull()

    if (largura != null && altura != null) {
        val area = largura * altura
        val tintaNecessaria = area / 2
        println("Área a ser pintada: ${"%.2f".format(area)} m²")
        println("Quantidade de tinta necessária: ${"%.2f".format(tintaNecessaria)} litros")
    } else {
        println("Valor inválido. Por favor, insira números válidos.")
    }
}
