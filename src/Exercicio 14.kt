fun main() {
    print("Digite o salário do funcionário: R$ ")
    val salario = readLine()?.toDoubleOrNull()

    if (salario != null) {
        val aumento = salario * 0.15
        val novoSalario = salario + aumento
        println("Novo salário com 15% de aumento: R$ ${"%.2f".format(novoSalario)}")
    } else {
        println("Valor inválido. Por favor, insira um número válido.")
    }
}
