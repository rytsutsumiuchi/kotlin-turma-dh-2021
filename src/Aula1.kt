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
}