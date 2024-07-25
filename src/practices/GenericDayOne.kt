package practices

fun <T> filter(list: List<T>): List<T> {
    val filterList = list.asReversed()
    return filterList
}
//todo: Kotlin doesn't support directly declaring a generic lambda as a property
 val  filterL : (List<Any>) -> List<Any> = {
     it.asReversed()
 }
/*
val <T> filterL1 : (List<T>) -> List<T> = {
    it.asReversed()
}
*/
//todo: use a non-generic lambda
val filter: (List<Any>) -> List<Any> = { list -> list.asReversed() }


fun main() {
    val listInt = listOf<Int>(1, 2, 3, 4)
    println(filter(listInt))
    val listString = listOf("Azhar", "Anwar", "Anis")
    println(filterL(listString))
}