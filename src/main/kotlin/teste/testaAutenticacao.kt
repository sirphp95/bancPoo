import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno


fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "pedro",
        senha = 123,
        cpf = "111-11",
        salario = 100.0
    )
    val diretor = Diretor(
        nome = "Thg",
        senha = 123,
        cpf = "222-121",
        salario = 200.0,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "ismael",
         cpf = "3333",
        senha = 1234


    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, senha = 100)
    sistema.entra(diretor, senha = 100)
    sistema.entra(cliente, senha = 100)


}
//interface nao mantem valores nem construtores