package br.com.alura.bytebank.modelo

abstract  class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
   protected val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {


    fun autentica(senha:Int): Boolean {
        if (senha == senha){
            return true
        }
        return false

    }

}
//alt enter ajuda a formatar
//open permite a herança
// ctrl b acha a origem
//ctrl m busca classe raiz
// uma classe que vai servir como modelo tem que ser abstract