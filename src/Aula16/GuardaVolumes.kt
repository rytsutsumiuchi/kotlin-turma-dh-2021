package Aula16

class GuardaVolumes {
    val dicionario = mutableMapOf<Int, List<Peca>>()
    var contador: Int = 0

    fun guardarPecas(listaDePeca: List<Peca>): Int{
        contador++
        dicionario[contador] = listaDePeca
        return contador
    }

    fun mostrarPecas(){
        dicionario.forEach{ entry ->
            entry.value.forEach{peca ->
                println("${entry.key} - ${peca.modelo}")
            }
        }
    }

    fun mostrarPecas(numero: Int){
        dicionario[numero]?.forEach {
            println(it.modelo)
        }

    }


    fun devovlerPecas(numero: Int){
        dicionario.remove(numero)
    }
}

fun main(){
    val camiseta = Peca("Hering", "T-Shirt")
    val calca = Peca("TNG", "Jeans")

    val guardaVolumes = GuardaVolumes()

    println("A senha do meu guarda volumes é: "
            + guardaVolumes.guardarPecas(listOf(camiseta, calca)))

    guardaVolumes.mostrarPecas()
}