import java.util.*
import kotlin.math.pow

fun main(){
    var cliente1 = Cliente(1234, "Tsutsumiuchi", 555, 666)
    var poupanca1 = ContaPoupanca(cliente1)

    println(poupanca1.saldo)
    //poupanca1.sacar(200.0)
    poupanca1.recolheJuros(1)
    println(poupanca1.saldo)
}
class Cliente(
    val numeroClente: Int,
    val sobrenome: String,
    val rg: Int,
    val cpf: Int
){

}

open class Contas(
    val cliente: Cliente
){
    var saldo: Double = 0.0

    fun depositar(valor: Double){
        saldo += valor
    }

    open fun sacar(valor: Double){
        if(valor <= saldo) saldo -= valor
        else println("saldo insuficiente")
    }

    fun consultarSaldo(){
        println("Seu saldo é de: $saldo")
    }
}

class ContaPoupanca(cliente: Cliente) : Contas(cliente = cliente){
    var taxaDeJuros: Double = 0.1

    fun recolheJuros(meses: Int){
        var juros: Double = saldo * (taxaDeJuros).pow(meses)

        print("Seu rendimento em " + meses + " mes(es) foi de: R$" + String.format("%.2f", juros) + " e serão aplicados à sua poupança\n")

        saldo += juros
    }
}

class ContaCorrente(cliente: Cliente) : Contas(cliente){

    var chequesDepositados = mutableListOf<Cheque>()
    var chequeEspecial: Double = 1000.0
    fun depositarCheque(cheque: Cheque){
    //
    }

    override fun sacar(valor: Double) {
       //executa o método pai
       // super.sacar(valor)
        //comandos do método filho (este)

        if(valor <= saldo) saldo -= valor
        else{
            saldo -= valor
            println("Você entrou no cheque especial")
        }
    }

}

class Cheque(
    val valor: Double,
    val bancoEmissor: String,
    val dataPagamento: Date
){

}