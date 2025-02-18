fun main() {
    print("Digite o número de dias trabalhados no mês: ")
    val diasTrabalhados = readLine()?.toIntOrNull()

    if (diasTrabalhados != null) {
        val horasPorDia = 8
        val valorPorHora = 25.0
        val salario = diasTrabalhados * horasPorDia * valorPorHora
        println("O salário do funcionário é: R$ ${"%.2f".format(salario)}")
    } else {
        println("Valor inválido. Por favor, insira um número válido.")
    }
}
