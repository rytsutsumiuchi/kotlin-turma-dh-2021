package Aula13R

class ContaPoupanca(
    override val nrConta: Int,
    override var saldo: Double,
    var limite: Double = 0.0
):ContaBancaria(), Imprimivel {
    override fun sacar(valor: Double) {
        if(valor > saldo + limite) println("Este valor ultrapassa o limite")
        else{
            saldo -= valor
            println("Você sacou R$$valor.\n" +
                    "Seu saldo atual é de: R$$saldo.")
        }
    }

    override fun depositar(valor: Double) {
        saldo += valor

        println("Você depositou R$$valor.\n" +
                "Seu saldo atual é de: R$$saldo.")
    }

    override fun mostrarDados() {
        println("Número da conta: $nrConta\n" +
                "Saldo: R$$saldo\n" +
                "Limite: R$$limite")
    }
}
