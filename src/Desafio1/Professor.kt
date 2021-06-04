package Desafio1

interface Professor {
    val nome: String
    val sobrenome: String
    val tempoDeCasa: Int
    val cdProfessor: Int

    override fun equals(other: Any?): Boolean
}