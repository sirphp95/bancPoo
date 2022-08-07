package br.com.alura.bytebank.modelo

class Analista(
     nome: String,
     cpf: String,
     salario: Double

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override val bonificacao: Double
        get() {
            return  + salario * 0.1
        }


}
// f5 em cima de um ambiente tu copia todo conteudo
//linha 6 herdando os atributos da classe funcionario
//como gerente compartilha as mesmas caracteristicas que funcionario, criamos um constructor com essas caracteristicas