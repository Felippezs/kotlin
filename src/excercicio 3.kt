fun main() {
    print("qual seu nome ?")
    val nome = readln()
    print("qual o seu salario ?")
    val salario = readln()?. toDoubleOrNull() ?: 0.0
    print("o nome do funcionario: $nome salario: R$$salario")
    println("O funcionario $nome tem um salario de R$$salario em junho")
}