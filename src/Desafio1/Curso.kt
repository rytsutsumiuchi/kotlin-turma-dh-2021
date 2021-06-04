package Desafio1

class Curso(
    val nome: String,
    val cdCurso: Int,
    val qtMaxAlunos: Int
) {
    var professorTitular: Professor? = null
    var professorAdjunto: Professor? = null
    val listaAlunosMatriculados: MutableList<Aluno> = mutableListOf()

    //add um aluno a lista caso a quantidade maxima não tenha sido ultrapassada
    fun adicionarUmAluno(umALuno: Aluno): Boolean{
        if(listaAlunosMatriculados.size < qtMaxAlunos){
            listaAlunosMatriculados.add(umALuno)
            return true
        }else return false
    }

    //remove um aluno do curso
    fun excluirAluno(umAluno: Aluno){
        listaAlunosMatriculados.remove(umAluno)
    }

    //sobrescreve o metodo equals para comparar cursos pelo cdCurso
    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Curso -> {
                this.cdCurso == other.cdCurso
            }
            else -> super.equals(other)
        }
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + cdCurso
        return result
    }
}