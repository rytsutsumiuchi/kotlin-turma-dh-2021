package Aula15

class Impressora {
    val listaImprimivel = mutableListOf<Imprimivel>()

    fun imprimeListaImprimivel(){
        listaImprimivel.forEach{
            it.imprimir()
        }
//        for(it in listaImprimivel){
//            it.imprimir()
//        }
    }
}

fun Impressora.addNaListaImprimivel(doc: Imprimivel) = this.listaImprimivel.add(doc)
