import br.com.alura.bytebank.*
import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente


fun testaFuncionario() {
    val alex = Analista(
        nome = "alex",
        cpf = "1221",
        salario = 4600.0
    )
    println("o nome do funcionario é ${alex.nome}")
    println("o cpf do funcionario é ${alex.cpf}")
    println("o salario do funcionario é ${alex.salario}")
    println("bonificacao ${alex.bonificacao}")

    val poc = Gerente(
        nome = "poc",
        cpf = "333.333.333",
        salario = 2200.0,
        senha = 12345
    )
    println("bonificacao ${poc.bonificacao}")
    if (poc.autentica(1234)) {
        println("autenticado")
    } else {
        println("falha na autenticacao")
    }
    val reno = Diretor(
        nome = "reno",
        salario = 1.000,
        senha = 1234,
        cpf = "123-332",
        plr = 200.0
    )
    val maria = Analista(
        nome = "Maria",
        cpf = "1111",
        salario = 3200.0
    )

    println("o nome do funcionario é ${reno.nome}")
    println("o cpf do funcionario é ${reno.cpf}")
    println("o salario do funcionario é ${reno.salario}")
    println("bonificacao ${reno.bonificacao}")
    println("plr ${reno.plr}")
    val calculadora = CalculadoraBonificacao()
    calculadora.registra(poc)
    calculadora.registra(reno)
    calculadora.registra(alex)
    calculadora.registra(maria)
    println("o total de bonificacao é: ${calculadora.total}")
}