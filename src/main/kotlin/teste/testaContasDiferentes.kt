import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca


fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "poc",
        numero = 123
    )
    val contaPoupanca = ContaPoupanca(
        titular = "reno",
        numero = 121
    )

    contaCorrente.deposito(valor = 1000.0)
    contaPoupanca.deposito(valor = 1000.0)

    println("saldo corrente ${contaCorrente.saldo}")
    println("saldo poupanca ${contaPoupanca.saldo}")

    contaCorrente.saque(valor = 100.0)
    contaPoupanca.saque(valor = 100.0)
    println("saldo apos saque corrente ${contaCorrente.saldo}")
    println("saldo apos saque poupanca ${contaPoupanca.saldo}")
    contaCorrente.transfere(valor = 200.0, contaPoupanca)
    println("saldo da conta poupanca pos transferencia: ${contaPoupanca.saldo}")
    println("saldo da conta corrente pos transferencia: ${contaCorrente.saldo}")
}