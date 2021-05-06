fun main(){
    //val - imutável - não consigo alterar
    //var - mutável - consigo alterar

    val inteiro: Int = 1
    val inteiro2 = 2
    val numeroGrande:Long = 2146545488918
    val texto = "Ricardo"
    val ehMaior = true
    val decimalMenor: Float = 2F



    var numero = 5


    //println("Hello world!")

    val pets = listOf("cachorro", "gato", "tartaruga", "hamster")
    val petsMutavel = mutableListOf("cachorro", "gato", "peixe", "galinha")
/*
    when {
        numero < 3 ->  println("Menor que 3")
        numero > 3    ->  println("Maior que 3")
        else      ->  println("numero é 3")
    }
  */
    petsMutavel.forEach{ pet ->
        println(pet)
    }

    //    meuNome()
//    meuNomeCompleto("Ricardo", "Tsutsumiuchi")
//    println(meuNomeCompletoComRetorno("Joao", "Kleber"))

    //   println(maiorInteiro(7, 22, 3))
    //   println(comparaTexto("casao", "casa"))
    //  println(ehPar(18))
    imprimeNumeros()
}

fun meuNome(){
    println("Ricardo T")
}

fun meuNomeCompleto(nome: String, sobrenome: String){
    println("$nome $sobrenome")
}

fun meuNomeCompletoComRetorno(nome: String, sobrenome: String): String{
    return "$nome $sobrenome"
}

fun maiorInteiro(n1: Int, n2: Int, n3: Int): Int{

    var tmp = n1

    if(n2 > tmp) tmp = n2
    if(n3 > tmp) tmp = n3

    return tmp
}

fun comparaTexto(texto1: String, texto2: String): Boolean{
    return texto1 == texto2
}

fun ehPar(num: Int): Boolean{
    return num % 2 == 0
}

fun imprimeNumeros(){
    var cont = 0
    var num = 1
    while(cont < 100){
        println(num)
        num+=2
        cont++
    }
}
