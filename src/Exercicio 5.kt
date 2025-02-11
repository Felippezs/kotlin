fun main() {
    print(" me de uma nota da primeira prova:")
    val nota1 = readln() ?. toIntOrNull() ?: 0
    print(" me de a nota da segunda prova:")
    val nota2 = readln() ?. toIntOrNull() ?: 0
    val media = nota1 + nota2 / 2
    println(" a media das duas notas é $media")
}