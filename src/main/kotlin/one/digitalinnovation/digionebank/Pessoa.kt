package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.456.789-10"
}

fun main() {
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)
}