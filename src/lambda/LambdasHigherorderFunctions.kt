package lambda


fun main() {

    val numbers = (1..100).toList()
    println(numbers.filter( { it % 2 == 0 }))
    println(numbers.filter { number: Int -> number % 2 == 0 })
    println(numbers.filter { it.even() })
    println(numbers.filter ( ::isEvens ))

}

fun isEvens(number: Int) = number % 2 == 0
fun Int.even() = this % 2 == 0