fun main() {
    print("Digite a quantidade de cigarros fumados por dia: ")
    val cigarrosPorDia = readLine()?.toIntOrNull()

    print("Digite quantos anos você já fumou: ")
    val anosFumados = readLine()?.toIntOrNull()

    if (cigarrosPorDia != null && anosFumados != null) {
        val minutosPorCigarro = 10
        val minutosPorDia = cigarrosPorDia * minutosPorCigarro
        val diasPerdidos = (minutosPorDia * 365 * anosFumados) / (24 * 60)

        println("O fumante perderá aproximadamente ${"%.2f".format(diasPerdidos)} dias de vida.")
    } else {
        println("Valor inválido. Por favor, insira números válidos.")
    }
}
