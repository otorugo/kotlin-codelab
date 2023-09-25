






// Possibilidade de adicionar funcoes a uma classe ja existente

fun String.lastChar() = get(length -1)




// As colecoes padroes em kotlin sao Colecoes Java + Extesions Kotlin

fun usableExtensionFuncions(){
    // junta os valores numa unica string
    listOf("a","b","c").joinToString()
    // pega um valor de uma lista se existir ou retorna null
    listOf("abc").getOrNull(1)
}


fun main(){
    println("Ola Mundo".lastChar())
}