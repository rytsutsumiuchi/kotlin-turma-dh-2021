package Aula10

import java.util.*

//pode ser abstract
abstract class Ingresso(
    val valor: Double
) {
     abstract fun imprimeValor()

}

open class VIP(
    valor: Double,
    val valorAdicional: Double = 0.0
): Ingresso(valor){

    override fun imprimeValor() {
        println("O valor do ingresso VIP é R$ $valor")
    }

    open fun retornaValor(): Double{
        return valor + valorAdicional
    }
}

class Normal(
    valor: Double
) : Ingresso(valor){


    override fun imprimeValor() {
        println("Ingresso Normal")
    }
}

class CamaroteInferior(
    valor: Double,
    val localizacaoIngresso: Int
): VIP(valor){

    fun imprimeLocalizacao(){
        println("Seu setor é o $localizacaoIngresso")
    }
}

class CamaroteSuperior(
    valor: Double,
    valorAdicional: Double
): VIP(valor, valorAdicional){

    override fun retornaValor(): Double {
        return valor + valorAdicional
    }
}

fun main(){
    println("Digite 1 para ingresso normal e 2 para VIP")
    val scanner = Scanner(System.`in`)
    val ingressoUm = scanner.nextInt()
    if(ingressoUm == 1){
        println("Você escolheu o ingresso Normal")
    }else{
        println("Você escolheo o ingresso VIP")
        println("OK! Agora escolha 1 para Camarote Superior " +
                "ou 2 para Camarote Inferior")
        val tipoVip = scanner.nextInt()
        if(tipoVip == 1){
            val superior = CamaroteSuperior(100.0, 50.0)
            println("Tudo Ok, o valor do ingresso no " +
                    "Camarote superior é ${superior.retornaValor()} reais")
        }else{
            val inferior = CamaroteInferior(100.0, 2)
            println("Tudo Ok, o valor do ingresso no " +
                    "Camarote superior é ${inferior.retornaValor()} reais")
            inferior.imprimeLocalizacao()
        }
    }
}