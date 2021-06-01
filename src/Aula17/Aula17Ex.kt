package Aula17

import java.lang.NullPointerException

fun main(){
    try {
        val lista: MutableList<String> = mutableListOf()
        lista.add("Pato")
        lista.add("Cachorro")
        lista.add("Gato")
        println(lista[3])

    }catch (e: IndexOutOfBoundsException){
        println(e.localizedMessage)
        println(e.stackTraceToString())
    }


    val lista2: MutableList<String>? = null
    lista2?.add("Pato")
    lista2?.add("Cachorro")
    lista2?.add("Gato")

    try{
        println(lista2!![2])
    }catch (e: NullPointerException){
        println(e.stackTraceToString())
    }

    val lista3: MutableList<String> = mutableListOf()
    lista3.add("Pato")
    lista3.add("Cachorro")
    lista3.add("Gato")

    try{
        println(lista3[5])
    }catch (e: java.lang.IndexOutOfBoundsException){
        println(e.stackTraceToString())
    }

}