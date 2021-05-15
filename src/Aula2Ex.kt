class Aposentadoria(val idade: Int, val genero: String, val tempoContribuicao: Int) {

    fun calculaAposentadoria(){
        val resp: Boolean
        if (tempoContribuicao >= 30){
            println(((genero == "Mulher" && idade >= 60)||(genero == "Homem" && idade >= 65)))
        }else println(false)

    }
}

fun main(){
    val joao = Aposentadoria(65, "Homem", 31)
    val maria = Aposentadoria(60, "Mulher", 30)
    val pedro = Aposentadoria(60, "Homem", 31)
    val ana = Aposentadoria(60, "Mulher", 29)

//    println("joao:" + joao.calculaAposentadoria())
//    println("maria:" + maria.calculaAposentadoria())
//    println("pedro:" + pedro.calculaAposentadoria())
//    println("ana:" + ana.calculaAposentadoria())
//    joao.calculaAposentadoria()
//    maria.calculaAposentadoria()
//    pedro.calculaAposentadoria()
//    ana.calculaAposentadoria()

    val exemplo1 = MultiplicaElementos(listOf(1,2,3,4,5,2))
    exemplo1.imprimeProduto()
}

class MultiplicaElementos(var lista: List<Int>){

//    fun imprimeProduto(){
//        var total: Int = 1
//        lista.forEach() {
//            total *= it
//        }
//    println(total)
//    }

    fun imprimeProduto(){
        var total: Int = 1
        for(i in lista) {
            total *= i
        }
        println(total)
    }
}