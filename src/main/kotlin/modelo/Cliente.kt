package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
   val senha: Int
): Autenticado {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        }
        return false
    }
}


