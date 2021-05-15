fun main(){
    val bichano = Bichano()
    val gato = Gato()

    bichano.come()
    println(bichano.sexo)
    println(gato.sexo)
    bichano.minhaRaca()

}

class Bichano: Gato(){

    override var sexo: String = "M"
    //polimorfismo
    //sobrescreve o método come da classe pai Animal

    init {
        raca = "gato"
    }
    override fun come() {
        super.come()
        println("Come do jeito bichano de ser")
    }

}

class Cachorro: Animal(
    sexo = "F"
){

}

open class Gato: Animal(
    sexo = "M",
    cor = "Preto"
){
    override fun come() {
        println("Come do jeito gato de ser")
    }
}

class Leao: Animal(){

}

open class Animal(
    open var sexo: String = "0"
){
    //apenas a classe tem acesso à variável
    //são necessário métodos de acesso pra acessá-la
    private var cor = ""
    protected var raca = "nenhuma"

    //this(sexo) atualiza a variável do construtor principal
    //quando o construtor secundário é chamado
    constructor(sexo: String, cor: String): this(sexo){
        this.cor = cor
    }

    open fun come(){
        println("como do jeito default")
    }

   fun minhaRaca(){
       println("minha raca é $raca")
   }

}