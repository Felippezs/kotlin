fun main() {
    print("Digite o preço do produto: R$ ")
    val preco = readLine()?.toDoubleOrNull()

    if (preco != null) {
        val desconto = preco * 0.05
        val precoPromocional = preco - desconto
        println("Preço com 5% de desconto: R$ ${"%.2f".format(precoPromocional)}")
    } else {
        println("Valor inválido. Por favor, insira um número válido.")
    }
}
