package Aula17

import java.lang.ArithmeticException
import kotlin.jvm.Throws

class CalculoMatematico {

    @Throws(ArithmeticException::class)
    fun divisao(num1: Int, num2: Int): Int{
        return if(num2 == 0){
            throw ArithmeticException("Divisão por zero")
        } else {
            num1 / num2
        }
    }
}

fun main(){
    val obj = CalculoMatematico()
    try {
        obj.divisao(4, 0)
    }catch(e: ArithmeticException){
        println("Divisão por zero")
    }

}