package Desafio1

fun main() {
    val dhm = DigitalHouseManager()

    //registra dois professores titulares
    dhm.registrarProfessorTitular("Carlos", "Meneses", 101, "Java")
    dhm.registrarProfessorTitular("Cesar", "Rodrigues", 102, "Kotlin")

    //outro professor
    dhm.registrarProfessorTitular("Bruce", "Wayne", 103, "Gestão")

    //registra dois professores adjuntos
    dhm.registrarProfessorAdjunto("Pedro", "Pereira", 201, 8)
    dhm.registrarProfessorAdjunto("Eduardo", "Misina", 202, 10)

    //registra 2 cursos
    dhm.registrarCurso("Full Stack", 20001, 3)
    dhm.registrarCurso("Android", 20002, 2)

    //outro curso
    dhm.registrarCurso("iOS", 20003, 2)

    //aloca um professor titular e um adjunto para cada curso
    dhm.alocarProfessores(20001, 101, 201)
    dhm.alocarProfessores(20002, 102, 202)

    //registra dois alunos na DH
    dhm.matricularAluno("Ricardo", "Tsutsumiuchi", 301)
    dhm.matricularAluno("Camila", "Mouro", 302)

    //registra tres alunos na DH
    dhm.matricularAluno("Marcelo", "Silva", 303)
    dhm.matricularAluno("Rodrigo", "Canela", 304)
    dhm.matricularAluno("Felipe", "Martins", 305)

    //outro aluno
    dhm.matricularAluno("Dick", "Grayson", 305)

    //matricula dois alunos no curso de Full Stack
    dhm.matricularAluno(301, 20001)
    dhm.matricularAluno(302, 20001)

    //matricula tres alunos no curso de Android (com impedimento do terceiro)
    dhm.matricularAluno(303, 20002)
    dhm.matricularAluno(304, 20002)
    dhm.matricularAluno(305, 20002)

    //busca o curso do aluno cod 301
    dhm.buscaCurso(301)

    /*
    // outros testes
        //exclui um curso
        dhm.listaCursos.forEach {
            println(it.nome)
        }

        dhm.excluirCurso(20003)

        dhm.listaCursos.forEach {
            println(it.nome)
        }

        //remove um professor da dh
        dhm.listaProfessores.forEach {
            println(it.nome)
        }

        dhm.excluirProfessor(103)

        dhm.listaProfessores.forEach {
            println(it.nome)
        }

        //remove um aluno de um curso
        dhm.mostraAlunosCurso(20001)
        dhm.excluirAluno(301, 20001)
        dhm.mostraAlunosCurso(20001)

        //remove um aluno da lista da DH
        dhm.listaAlunos.forEach {
            println(it.nome)
        }

        dhm.excluirAluno(305)

        dhm.listaAlunos.forEach {
            println(it.nome)
        }
    */

}