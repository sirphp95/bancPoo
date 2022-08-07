package br.com.alura.bytebank.modelo

 abstract class Conta(var titular: String, var numero: Int) {

    var saldo = 0.0
        protected set

    fun deposito(valor: Double) {
        this.saldo += valor
    }

   abstract fun saque(valor: Double)

     fun transfere(
        valor: Double,
        destino: Conta
    ): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposito(valor)
            return true
        }
        return false
    }

}
 //quando conta vira abstrato, ela nao pode ser usada, entao
 //vc deve usar conta poupanca ou corrente, que sao derivadas dela
 //protectd permite que os filhos modifiquem o valor