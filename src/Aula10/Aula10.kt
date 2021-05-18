abstract class Automovel {

    abstract val nome: String

    abstract fun acelerar()

    abstract fun frear()

    fun teste(){

    }
}

class Ferrari : Automovel() {
    override var nome: String = "Ferrari F50"

    override fun acelerar() {
        println("Acelerando!!!")
    }

    override fun frear() {
        println("Freando...")
    }
}