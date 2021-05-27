package Aula13R

class Banco: Imprimivel{
    val listaDeContas = mutableListOf<ContaBancaria>()

    fun inserirConta(contaBancaria: ContaBancaria){
        listaDeContas.add(contaBancaria)
    }

    fun removerConta(contaBancaria: ContaBancaria){
        listaDeContas.remove(contaBancaria)
    }

    fun procurarConta(nrConta: Int): ContaBancaria? {
        listaDeContas.forEach{
            if(nrConta == it.nrConta) return it
        }
        println("Conta não encontrada")
        return null
    }

    override fun mostrarDados() {
        listaDeContas.forEach{
            it.mostrarDados()
        }
    }


}