package Desafio1

fun main(){
    val dhm = DigitalHouseManager()


    dhm.registrarProfessorTitular("Carlos", "Meneses", 101, "Java")
    dhm.registrarProfessorTitular("Cesar", "Rodrigues", 102, "Kotlin")

    dhm.registrarProfessorAdjunto("Pedro", "Pereira", 201, 8)
    dhm.registrarProfessorAdjunto("Eduardo", "Misina", 202, 10)


    dhm.registrarCurso("Full Stack", 20001, 3)
    dhm.registrarCurso("Android", 20002, 2)

    dhm.alocarProfessores(20001, 101, 201)
    dhm.alocarProfessores(20002, 102, 202)

    dhm.matricularAluno("Ricardo", "Tsutsumiuchi", 301)
    dhm.matricularAluno("Camila", "Mouro", 302)

    dhm.matricularAluno("Marcelo", "Silva", 303)
    dhm.matricularAluno("Rodrigo", "Canela", 304)
    dhm.matricularAluno("Felipe", "Martins", 305)

    dhm.matricularAluno(301, 20001)
    dhm.matricularAluno(302, 20001)

    dhm.matricularAluno(303, 20002)
    dhm.matricularAluno(304, 20002)
    dhm.matricularAluno(305, 20002)

//    dhm.listaCursos.first { it.cdCurso == 20002 }.listaAlunosMatriculados.forEach {
//        println(it.nome +" " +  it.sobrenome)
//    }
//
//    dhm.listaMatriculas.forEach {
//        println(it.dtMatricula)
//    }
}