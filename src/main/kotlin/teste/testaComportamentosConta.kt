
package br.com.alura.bytebank.teste
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import java.sql.DriverManager.println


fun testaComportamentosConta() {
    val contaPedro = ContaCorrente(titular = "pedro", numero = 1000)
    contaPedro.deposito(valor = 200.0)


    val contaPoc = ContaPoupanca(titular = "poc", numero = 1001)


    print(" o nome do titular da conta é ${contaPoc.titular},  o saldo da conta é ${contaPoc.saldo} e o numero da conta é ${contaPoc.saldo}")
    println(" depositando na conta do pedro")
    contaPedro.deposito(valor = 50.0)
    println(contaPedro.saldo)
    println("sacando na conta do pedro")
    contaPedro.saque(100.0)
    println(contaPedro.saldo)
    println("sacando na conta do pedro")
    contaPedro.saque(100.0)
    println(contaPedro.saldo)

    println("Transferindo da conta do pedro para do poc")
}