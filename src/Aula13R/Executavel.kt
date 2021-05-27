package Aula13R

import java.util.*

fun main(){
    val cc = ContaCorrente(1234, 1000.0, 10.0)
    val pp = ContaPoupanca(9876, 1000.0, 500.0)
    val relatorio = Relatorio()
    val banco = Banco()

    println("Digite 1 para abrir uma conta poupança" +
            " ou 2 para abrir uma conta corrente:")

    val scanner = Scanner(System.`in`)

    val tipoConta = scanner.nextInt()

    if(tipoConta == 1){
        println("Você escolheu Conta Poupança!")
    }

//    banco.inserirConta(cc)
//    banco.inserirConta(pp)
//
//    (banco.procurarConta(1222))?.mostrarDados()
//
//    banco.mostrarDados()

//    cc.sacar(100.0)
//    cc.depositar(10.0)
//
//    pp.sacar(100.0)
//    pp.depositar(10.0)
//
//    relatorio.gerarRelatorio(cc)
//
//    relatorio.gerarRelatorio(pp)
//
//    cc.transferir(50.0, pp)
//
//    relatorio.gerarRelatorio(cc)
//
//    relatorio.gerarRelatorio(pp)
}