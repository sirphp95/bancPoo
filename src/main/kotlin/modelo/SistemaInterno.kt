package br.com.alura.bytebank.modelo

class SistemaInterno {
    fun entra(admin: Autenticado, senha: Int){
        if (admin.autentica(senha)){
            println("bem vindo ao bytebank")
        } else { println("falha a autenticacao")

    } } }
