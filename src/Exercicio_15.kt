fun main() {
    print("Digite a quantidade de Km percorridos: ")
    val kmPercorridos = readLine()?.toDoubleOrNull()

    print("Digite a quantidade de dias alugados: ")
    val diasAlugados = readLine()?.toIntOrNull()

    if (kmPercorridos != null && diasAlugados != null) {
        val precoDia = 90.0
        val precoKm = 0.20
        val valorTotal = (diasAlugados * precoDia) + (kmPercorridos * precoKm)
        println("O valor total a pagar é: R$ ${"%.2f".format(valorTotal)}")
    } else {
        println("Valor inválido. Por favor, insira números válidos.")
    }
}
