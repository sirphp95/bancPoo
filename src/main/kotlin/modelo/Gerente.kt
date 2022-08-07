package br.com.alura.bytebank.modelo

class Gerente(
     nome: String,
     cpf: String,
     salario: Double,
     senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticado {
    override val bonificacao: Double
        get() {
            return  salario
        }



}
// f5 em cima de um ambiente tu copia todo conteudo
//linha 6 herdando os atributos da classe funcionario
//como gerente compartilha as mesmas caracteristicas que funcionario, criamos um constructor com essas caracteristicas