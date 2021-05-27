package Aula15

class Foto(
    override val nome: String,
    override val tipoDeDocumento: String
): Imprimivel {

    override fun imprimir() {
        println("Eu sou uma selfie $nome$tipoDeDocumento")
    }

}