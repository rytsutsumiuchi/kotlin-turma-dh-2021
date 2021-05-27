package Aula15

import java.text.NumberFormat
import java.util.*

fun main(){
    val nome = "Ricardo"
    println(nome.colocarSobrenome("TT"))
    val dezReais = 10.0
    println(dezReais.formatarParaReal())

    println("Digite o valor em reais:")
    val scanner = Scanner(System.`in`)
    val real = readLine()?.toDouble()
    println(real?.formatarParaReal())
}

//extensão pode ser criada com qualquer classe
fun String.colocarSobrenome(lastName: String): String{
    return "$this $lastName"
}

fun Double.formatarParaReal(): String{
    val numberFormat = NumberFormat
        .getCurrencyInstance(Locale("pt", "BR"))
    return numberFormat.format(this)
}
