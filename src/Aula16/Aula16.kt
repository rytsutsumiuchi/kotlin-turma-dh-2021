package Aula16

fun main(){
    //List é uma coleção ordenada de elementos com acesso por índices

    //somente leitura, não pode adicionar elementos
    val listaImutavel = listOf(1, "palavra", 1.0, 10.0f)

    //possível modificar, adicionar elementos
    val listaMutavel = mutableListOf(1, 2, 3, 4)
    listaMutavel.add(5)


    //Set é uma coleção de elementos únicos - não permite repetição

    //ignora elementos repetidos
    val setImutavel = setOf(1, 2, 3, 4, 2)

    //"A" e "a" são elementos distintos seguindo a tabela ascii
    val setImutavel1 = setOf("A", "a", "b", "c")

    //Set mutável, cria o conjunto 4, 3, 2, 1, 5
    val setMutavel = mutableSetOf(4, 3, 2, 1, 4, 2)
    setMutavel.add(5)

    val p1 = Pessoa("joao")
    val p2 = Pessoa("joao")
    val p3 = Pessoa("maria")

    //Exibe apenas p1 e p3
    val testeSet = setOf(p1.nome, p2.nome, p3.nome)
    //println(testeSet)

    //Map é um conjunto de pares valor-chave.
    //caso outro valor seja inserido com uma chave já utilizada, ela é sobrescrita
    val mapImutavel = mapOf(
        123 to "João",
        456 to "Maria",
        789 to "Ricardo",
        789 to "Rodrigo"
    )

    //Um elemento pode ter mais de uma chave
    val mapImutavel2 = mapOf(
        1 to p1,
        2 to p1,
        3 to p2
    )
   // println(mapImutavel2)

    println(mapImutavel)
}

class Pessoa(val nome: String){}