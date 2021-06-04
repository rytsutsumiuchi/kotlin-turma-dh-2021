package Desafio1

class DigitalHouseManager {
    val listaAlunos: MutableList<Aluno> = mutableListOf()
    val listaProfessores: MutableList<Professor> = mutableListOf()
    val listaCursos: MutableList<Curso> = mutableListOf()
    val listaMatriculas: MutableList<Matricula> = mutableListOf()

    //registra um curso na lista de cursos
    fun registrarCurso(nome: String, cdCurso: Int, qtMaxAlunos: Int){
        val curso = Curso(nome, cdCurso, qtMaxAlunos)
        listaCursos.add(curso)
    }

    //remove um curso da lista de cursos
    fun excluirCurso(cdCurso: Int){
        listaCursos.removeAt(cdCurso)
    }

    //registra um professor adjunto na lista de professores
    fun registrarProfessorAdjunto(nome: String, sobrenome: String,
                              cdProfessor: Int, qtHorasDisponiveisMonitoria: Int){
        val professorAdjunto = ProfessorAdjunto(nome = nome,sobrenome =  sobrenome,
        cdProfessor = cdProfessor, qtHorasDisponiveisMonitoria = qtHorasDisponiveisMonitoria)

        listaProfessores.add(professorAdjunto)
    }

    //registra um professor titular na lista de professores
    fun registrarProfessorTitular(nome: String, sobrenome: String,
                                  cdProfessor: Int, especialidade: String){
        val professorTitular = ProfessorTitular(nome = nome,sobrenome =  sobrenome,
                         cdProfessor = cdProfessor, especialidade = especialidade)

        listaProfessores.add(professorTitular)
    }

    //remove um professor da lista de professores
    fun excluirProfessor(cdProfessor: Int){
        listaProfessores.removeAt(cdProfessor)
    }

    //registra um aluno na lista de alunos
    fun matricularAluno(nome: String, sobrenome: String, cdAluno: Int){
        val aluno = Aluno(nome, sobrenome, cdAluno)

        listaAlunos.add(aluno)
    }

    //registra uma matricula na lista de matriculas
    fun matricularAluno(cdAluno: Int, cdCurso: Int){
        val aluno = listaAlunos.first{ it.cdAluno == cdAluno }
        val curso = listaCursos.first { it.cdCurso == cdCurso }

        if (listaCursos.first { it.cdCurso == cdCurso }.adicionarUmAluno(listaAlunos.first { it.cdAluno == cdAluno })){
            val matricula = Matricula(listaAlunos.first { it.cdAluno == cdAluno }, listaCursos.first{it.cdCurso == cdCurso})

            listaMatriculas.add(matricula)

            println("Aluno matriculado!")
        }
        else{
            println("Não foi possível matricular o aluno, não há " +
                    "vagas no curso desejado")
        }
    }

    fun alocarProfessores(cdCurso: Int, cdProfessorTitular: Int, cdProfessorAdjunto: Int){
        listaCursos.first{it.cdCurso == cdCurso}.professorTitular = listaProfessores.first{it.cdProfessor == cdProfessorTitular}

        listaCursos.first{it.cdCurso == cdCurso}.professorAdjunto = listaProfessores.first{it.cdProfessor== cdProfessorAdjunto}
    }

}