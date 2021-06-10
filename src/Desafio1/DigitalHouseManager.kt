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
        if(listaCursos.removeIf { it.cdCurso == cdCurso }) {
            println("Curso removido!")
        }
        else{
            println("Curso não encontrado!")
        }
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
        listaProfessores.removeIf { it.cdProfessor == cdProfessor }
    }

    //registra um aluno na lista de alunos
    fun matricularAluno(nome: String, sobrenome: String, cdAluno: Int){
        val aluno = Aluno(nome, sobrenome, cdAluno)

        listaAlunos.add(aluno)
    }

    //exlui um aluno da lista de alunos da DH
    fun excluirAluno(cdAluno: Int){
        listaAlunos.removeIf { it.cdAluno == cdAluno }
    }

    //exclui um aluno da lista de um curso
    fun excluirAluno(cdAluno: Int, cdCurso: Int){
        listaCursos.first { it.cdCurso == cdCurso }.excluirAluno(listaAlunos.first { it.cdAluno == cdAluno })
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

    //aloca um professor titular e um adjunto em um curso
    fun alocarProfessores(cdCurso: Int, cdProfessorTitular: Int, cdProfessorAdjunto: Int){
        listaCursos.first{it.cdCurso == cdCurso}.professorTitular = listaProfessores.first{it.cdProfessor == cdProfessorTitular}

        listaCursos.first{it.cdCurso == cdCurso}.professorAdjunto = listaProfessores.first{it.cdProfessor== cdProfessorAdjunto}
    }

    //busca em qual curso o aluno está matriculado
    fun buscaCurso(cdAluno: Int){
        listaMatriculas.forEach {
            if(it.aluno.cdAluno == cdAluno){
                println("${it.aluno.nome}, você está matriculado no curso ${it.curso.nome}")
            }
        }
    }

    //alunos matriculados no curso
    fun mostraAlunosCurso(cdCurso: Int){
        listaCursos.first { it.cdCurso == cdCurso }.listaAlunosMatriculados.forEach {
            println(it.nome)
        }
    }

}