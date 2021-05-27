package Aula15

fun main(){
    val doc1 = Documento(nome = "Trabalho", tipoDeDocumento = ".docx")
    val foto1 = Foto(nome = "Minhas férias", tipoDeDocumento = ".jpg")
    val contrato1 = Contrato(nome = "Contrato de venda", tipoDeDocumento = ".pdf")

    val impressora = Impressora()

    impressora.addNaListaImprimivel(doc1)
    impressora.addNaListaImprimivel(foto1)
    impressora.addNaListaImprimivel(contrato1)

    impressora.imprimeListaImprimivel()
}