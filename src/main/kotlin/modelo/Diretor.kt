package br.com.alura.bytebank.modelo

class Diretor(
     nome: String,
     cpf: String,
     salario: Double,
     senha: Int,
     val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha

), Autenticado {
    override val bonificacao: Double
        get() {
            return + salario + plr

        }

    }


//super chama a classe mae
//linha 6 herdando os atributos da classe funcionario
//como gerente compartilha as mesmas caracteristicas que funcionario, criamos um constructor com essas caracteristicas