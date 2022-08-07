import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca


fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaPedro = ContaCorrente(titular = "Pedro", numero = 1002)
    contaPedro.titular = "pedro"
    var contaPoc = ContaPoupanca(titular = "Poc", numero = 1003 )
    contaPoc.titular = "poc"
    contaPedro.titular = "pedro"

    println("titular conta joao: ${contaPedro.titular}")
    println("titular conta maria: ${contaPoc.titular}")

    println(contaPedro)
    println(contaPoc)
}