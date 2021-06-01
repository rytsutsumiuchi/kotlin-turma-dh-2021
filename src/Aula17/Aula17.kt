package Aula17

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

fun main(){


    try{
        //ArithmeticException divided by zero
        //val teste = 2/0

        //NullPointerException
        //a ? indica que a variável pode ser nula
       // val teste1: String? = null
       // Usar ? no lugar do !! evita o exception
        //!! força que a referência de um objeto seja acessada
       // teste1!!.length

        //Não é tratado individualmente, caindo em Exception, classe mãe
        //val teste2 = listOf(1, 2, 4)
        //teste2[3]
        //getOrNull trata o erro como o operador ?
       // val teste3 = teste2.getOrNull(3)


    } catch(e: ArithmeticException){
        println("Not a number")
        //exibe o tipo de erro
        println(e.localizedMessage)
    } catch(e: NullPointerException){
        println("Variável nula")
        println(e.localizedMessage)
    } catch(e: Exception){
        println("Qualquer erro")
        println(e.localizedMessage)
    }

}