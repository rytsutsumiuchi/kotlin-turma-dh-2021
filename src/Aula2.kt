class Animal(
    //construtor primario
    nome: String,
    tipo: String
)
{
    var reino = ""
    //construtor secundario
    constructor(nome: String, tipo: String, classe: String): this(nome, tipo){
        this.reino = reino
    }
    val teste1 = "execucao 1"
    val nomeETipo = "$nome - $tipo"

    init{
        println(teste1)
    }

    val teste2 = "execucao 2"

    init{
        println(teste2)
    }

    fun sobre(){
        println(nomeETipo)
    }

}

fun main(){
    val bidu = Animal("Bidu", "Cachorro")
    val tappy = Animal("Tappy", "Gato", "Mamífero")

    bidu.sobre()
    tappy.sobre()
}