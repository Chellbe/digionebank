package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val maria = Gerente(nome = "Maria Júlia", cpf = "123.456.789-11", salario = 5000.0, senha = "senha123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}

