package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {
    var total:Double = 0.0
        private set
    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }
    /*fun registra(gerente: modelo.Gerente){
        this.total += gerente.bonificacao()
    }
    fun registra(diretor: modelo.Diretor){
        this.total += diretor.bonificacao()
    }*/



}
//ctrl b entra no primeiro lugar