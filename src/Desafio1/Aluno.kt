package Desafio1

class Aluno(
    val nome: String,
    val sobrenome: String,
    val cdAluno: Int
) {

    //sobrescreve o metodo equals para comparar alunos pelo cdAluno
    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Aluno -> {
                this.cdAluno == other.cdAluno
            }
            else -> super.equals(other)
        }
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + sobrenome.hashCode()
        result = 31 * result + cdAluno
        return result
    }

}