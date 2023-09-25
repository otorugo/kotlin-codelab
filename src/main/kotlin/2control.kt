//if
// inline if
fun maxNum(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxNumWithBody (a : Int, b : Int): Int{
    if(a > b){
        return a
    }else{
        return b
    }
}

fun maxNumWithBodyAlternative (a : Int, b : Int): Int{
    return if(a > b){
        a
    }else{
        b
    }
}



// when

enum class Color {
    BLUE, RED, GREEN
}
fun getDescription(color : Color) :String =
    when(color){
        Color.BLUE -> "cold"
        Color.GREEN -> "forest"
        Color.RED -> "hot"
    }

// loops
// while e do while
//Essa funcao vai rodar ate o infinito
fun infinite(){
    while(true){}
    do {}while (true)
}

// for loop
fun notInfinite(){
    val myList = listOf("a","b","c")
    //    simple for
    for (s in myList){
        print(s)
    }
    // for with range
    for (i in 1..9){
        println(i)
    }
}

fun checkInRange(){
    val list = listOf("a","b","c")
    if("a" in list){
        println("Estou dentro!!")
    }
}




fun main(){

}