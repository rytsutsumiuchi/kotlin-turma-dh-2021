package Aula11

import javax.print.attribute.standard.MediaSize

fun main(){
    val saoPaulo = SaoPaulo()

    saoPaulo.colherEstadoX()
}
interface RegraDeBronze{

}

//interfaces podem herdar de outras interfaes, mas não de classes
interface RegraDeOuro: RegraDeBronze{

    //não pode inicializar variáveis
    val icms: Double
    //não precisa de abstract
    //gasta menos memória
    fun colherEstadoX(): Double

    fun colherEstadoY(): String

    fun colherEstadoZ()
}

abstract class RegraDePrata{

    //pode inicializar variáveis (guardar estado)
    val icms = 7.0

    //precisa da palavra reservada abstract
    abstract fun colherEstadoX(): Double

    abstract fun colherEstadoY(): String

    abstract fun colherEstadoZ()
}

//não precisa de () em RegraDeOuro [não precisa instanciar um objeto]
class SaoPaulo(): RegraDeOuro{
    override val icms: Double = 7.0

    override fun colherEstadoX(): Double {
        TODO("Not yet implemented")
    }

    override fun colherEstadoY(): String {
        TODO("Not yet implemented")
    }

    override fun colherEstadoZ() {
        TODO("Not yet implemented")
    }


}