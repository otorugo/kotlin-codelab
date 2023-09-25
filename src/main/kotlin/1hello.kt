

fun hello() {
    val name = "Kotlin"
    // Strings templates
    println("Hello, $name!")
}

// variables

fun variables() {
    // Eh bom nao omitir o tipo da variavel
    // deixar o "tipo" aparecendo deixa o codigo mais claro

    //  Nao muda
    val name = "Meu Nome"
    // muda
    var idade = 2

    // dois tipos basicos de listas em kotlin
    //  - lista mutavel e imutavel
    val list = mutableListOf("Kotlin")
    val listTwo = listOf("Kotlin")

}

// funcoes
fun max(a: Int, b: Int) : Int {
    return if (a > b) a else b
}
fun maxInlineVersion(a: Int, b: Int)  = if (a > b) a else b

// named params
fun putCharInMiddle(a: String, b: String,  c : String = "---"): String {
    return listOf(a,c,b).joinToString()
}
fun main(){
    hello()
}