package Aula09R

class Fatura(
    val itens: List<Item>
){
    fun getTotalFatura(): Double{
        var total: Double = 0.0
        itens.forEach{
           total += it.precoUnit * it.qtdComprada
        }

        return total
    }

}

class Item(
    val numItem: Int,
    val descricao: String,
    val qtdComprada: Int = 0,
    var precoUnit: Double = 0.0

){

}

fun main(){
    val notebook = Item(123, "Notebook Dell", 5, 3000.0)
    val mouse = Item(456, "Mouse Logitech", 10, 30.0)
    val teclado = Item(789, "Teclado Logitech", 5, 50.0)

    val fatura = Fatura(listOf(notebook, mouse, teclado))

    println(String.format("%.2f", fatura.getTotalFatura()))
}