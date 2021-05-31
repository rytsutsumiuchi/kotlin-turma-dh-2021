package Aula16

fun main(){
    val loteria = mapOf(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )

    val apelidos = mapOf(
        "João" to listOf("Juan", "Fissura", "Maromba"),
        "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
        "Lucas" to listOf("Lukinha", "Jorge", "George")
    )

    apelidos.forEach{entry ->
        entry.value.forEach{ apelido ->
            println("${entry.key} - $apelido")
        }
    }


}