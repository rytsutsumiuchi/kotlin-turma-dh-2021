package Aula13R

class ContaCorrente(
    override val nrConta: Int,
    override var saldo: Double,
    var taxaDeOperacao: Double = 0.0
):ContaBancaria(), Imprimivel {
    override fun sacar(valor: Double) {
        if(valor+taxaDeOperacao > saldo) println("Saldo insuficiente")
        else{
            saldo -= valor+taxaDeOperacao
            println("Você sacou R$$valor.\n" +
                    "Seu saldo atual é de: R$$saldo.")
        }
    }

    override fun depositar(valor: Double) {
        saldo += valor - taxaDeOperacao

        println("Você depositou R$$valor.\n" +
                "Seu saldo atual é de: R$$saldo.")
    }



    override fun mostrarDados() {
        println("Número da conta: $nrConta\n" +
                "Saldo: R$$saldo\n" +
                "Taxa de Operação: R$$taxaDeOperacao")
    }
}