package Aula09R

open class Pessoa(
    val nome: String
){}

class Aluno(
    nome: String,
    val sobrenome: String,
    val RA: Int
):  Pessoa(nome)
{
    fun assistirAula(){
        println("${this.nome} está vendo a aula")
    }

    fun fazerLicao(){
        println("${this.nome} está fazendo a lição de casa")
    }

}

class Professor(
    nome: String,
   val RD: Int
):  Pessoa(nome)
{
    fun darAula(aula: Aula){

    }

    fun fazerChamada(){

    }

}

class Curso(
    val nome: String,
    val listaAulas: List<Aula>,
    val listaAlunos: List<Aluno>,
    val professorResp: Professor
){

}

class Turma(
    val nomeTurma: String,
    val curso: Curso
){

}

class Materia(
    val nome: String
){

}

class Aula(
    val materia: Materia,
    val horaInicio: String,
    val horaFim: String
){

}

fun main(){
    val poo = Materia("poo")
    val android = Materia("android")

    val aulaPoo = Aula(poo, "19:00", "21:00")
    val aulaAndroid = Aula(android, "21:00", "23:00")

    val ricardo = Aluno("Ricardo", "T", 12345)
    val joao = Aluno("João", "Souza", 67890)

    val cesar = Professor("César", 99123)
    val edu = Professor("Edu", 99456)

    val computacao = Curso("Computação", listOf(aulaPoo, aulaAndroid), listOf(ricardo, joao), cesar)

    val turma = Turma("Turma2021", computacao)

    turma.curso.listaAlunos.forEach{
        println("O nome do aluno é ${it.nome} ${it.sobrenome} e o registro " +
                "academico é ${it.RA}")
    }

    turma.curso.listaAulas.forEach{
        println("A aula de ${it.materia.nome} começa às ${it.horaInicio} e termina às " +
                "${it.horaFim}")
    }


}