package Aula13R

abstract class ContaBancaria(): Imprimivel{

    abstract val nrConta: Int
    abstract var saldo: Double

    abstract fun sacar(valor: Double)
    abstract fun depositar(valor: Double)

    fun transferir(valor: Double, contaBancaria: ContaBancaria){
        println("Transferência:")
        sacar(valor)
        contaBancaria.depositar(valor)
    }
}