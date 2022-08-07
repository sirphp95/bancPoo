package br.com.alura.bytebank.modelo

abstract  class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract val bonificacao: Double



}
//alt enter ajuda a formatar
//open permite a herança
// ctrl b acha a origem
//ctrl m busca classe raiz
// uma classe que vai servir como modelo tem que ser abstract