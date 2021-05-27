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

    override fun equals(other: Any?): Boolean {
        val outraFerrari = other as? Ferrari
        return when(other) {
            is Ferrari -> {
                this.nome == outraFerrari?.nome
            }
            else -> {
                super.equals(other)
            }
        }
    }
}