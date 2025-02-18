fun main() {
    print("Digite quanto dinheiro você tem na carteira (em R$): ")
    val reais = readln()?.toDoubleOrNull()

    if (reais != null) {
        val cotacaoDolar = 3.45
        val dolares = reais / cotacaoDolar
        println("Com R$ $reais você pode comprar US$ ${"%.2f".format(dolares)}")
    } else {
        println("Valor inválido. Por favor, insira um número válido.")
    }
}
