package Aula14

fun main(){
    //Named arguments permitem passar parâmetros fora da ordem da função
    nomeEIdadeComDefaultArguments(sobrenome = "T", nome = "Ricardo")

    var nomeCompleto = nomeEIdadeComRetorno("Ricardo", "29")
    println(nomeCompleto)

    //number e nome são parametros passados
    testeLambda(2.0) { number, nome ->
        return@testeLambda "teste função"
    }

    //caso o parâmetro seja passado após o lambda
    testeLambda2({
        return@testeLambda2 "teste função"
     }, 2.0)

    val animais = listOf("Peixe", "Cachorro", "Gato")
    //foreach também é uma função lambda
    animais.forEach { animal ->
        println(animal)
    }

    val listaNula = listOf<String>()
    val nullSafety = NullSAfety(null)
    nullSafety.sobrenome
    nullSafety.nome

    val b: String? = "12345"
    println(b?.length ?: 0)

    b?.length ?: run{
        val soma = 2+2
        println(soma)
    }
}


fun nomeEIdade(nome: String, idade: String){

}

fun nomeEIdadeComRetorno(nome: String, idade: String): String{
    return "O nome é $nome e a idade $idade"
}

fun nomeEIdadeComDefaultArguments(
    nome: String = "Fulano",
    sobrenome: String = "De Tal"
){

}

//Função anônima (lambda)
fun testeLambda(number: Double, xpto: (number1: String, nome: String) -> String){
    println("A String da minha função anônima é" +
            " ${xpto(number.toString(), number.toString())}")
}

fun testeLambda2(xpto: () -> String, number: Double){
    println("A String da minha função anônima é" +
            " ${xpto()}")
}

class NullSAfety(
    val nome: String?,
    val sobrenome: String = "TT"
){

}