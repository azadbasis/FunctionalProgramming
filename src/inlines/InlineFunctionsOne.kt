package inlines

inline fun execute(action: () -> Unit) {
    action()
}

inline fun execute1(sum: (Int) -> Int):Int {
    return sum(0)  // Example call with an argument
}
//todo:Fixed Argument Function:
inline fun execute2(sub:(Int,Int)->Int){
    val result=sub(10,4)
    println(result)
}
//todo:Flexible Argument Function:
inline fun execute3(a:Int,b:Int,operation:(Int,Int)->Int){
    val result=operation(a,b)
    println(result)
}

val action = {
    println("Azhar")
    println("Azhar")
    println("Azhar")
    println("Azhar")
}

fun main() {
    execute(action)
//    execute({ println("Azhar") })
    execute {
        println("Azhar")
        println("Azhar")
    }
    val result = execute1 { 2 }
    println(result)
    execute2 { a, b -> a - b }
    execute3(40,12) { a, b -> a - b }
    execute3(40,12) { a, b -> a / b }
    execute3(40,12) { a, b -> a * b }
}