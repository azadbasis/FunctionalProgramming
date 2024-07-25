package higherOrder

//todo:Built in Higher Order Function->Filter

fun main() {
    val numbers = listOf(11, 32, 44, 22)
    val names = listOf("Azhar", "Anwar", "Anis")

    //Lambda argument should be moved out of parentheses
    println(numbers.filter({ number -> number % 2 == 0 }))
    println(names.filter({ name -> name.length % 2 == 0 }))

    //Unnecessary parentheses in function call with lambda
    println(numbers.filter() { number -> number % 2 == 0 })
    println(names.filter() { name -> name.length % 2 == 0 })

    //standard way
    println(numbers.filter { number -> number % 2 == 0 })
    println(names.filter { name -> name.length % 2 == 0 })

    //use extension function
    println(numbers.filter { number -> number.Even() })
    println(numbers.filter { it.Even() })
    println(names.filter { name -> name.length.Even() })
    println(names.filter { it.length.Even() })

    //use function reference
    println(numbers.filter ( ::even )) 
    println(names.filter { even(it.length) })
}

fun even(number: Int) = number % 2 == 0
fun Int.Even() = this % 2 == 0
