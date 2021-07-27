package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rachel"
    var cpf: String = "123.456.789-10"
}

fun main() {
    val rachel = Pessoa()

    println(rachel.nome)
    println(rachel.cpf)
}