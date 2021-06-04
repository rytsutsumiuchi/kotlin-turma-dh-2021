package Desafio1

class ProfessorAdjunto(
    override val nome: String,
    override val sobrenome: String,
    override val tempoDeCasa: Int = 0,
    override val cdProfessor: Int,
    val qtHorasDisponiveisMonitoria: Int
) : Professor {

    //sobrescreve o metodo equals para comparar professores pelo cdProfessor
    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Professor -> {
                this.cdProfessor == other.cdProfessor
            }
            else -> super.equals(other)
        }
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + sobrenome.hashCode()
        result = 31 * result + tempoDeCasa
        result = 31 * result + cdProfessor
        result = 31 * result + qtHorasDisponiveisMonitoria
        return result
    }


}