package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val rachel = Pessoa(nome = "Rachel Esteves", cpf = "123.456.789-10")

    println(rachel.nome)
    println(rachel.cpf)

    val joao = Funcionario(nome = "Joao Esteves", cpf = "123.456.789-11", BigDecimal.valueOf(2000.0))

    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}