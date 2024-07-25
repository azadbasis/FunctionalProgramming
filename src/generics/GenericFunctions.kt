package generics



/*
* Customizing Existing Classes:
You can extend existing classes to provide custom behavior. For example, let’s add
*  a method to the List interface that returns the second element (if available):
* */

fun <T> List<T>.secondOrNull(): T? {
    return if (size >= 2) this[1] else null
}

val <T> List<T>.secondOrNullL: () -> T? get() = {  if (size >= 2) this[1] else null }


fun main() {
    val numbers = listOf(12, 22, 778)
    val names = listOf("Azhar", "Anwar", "Anis")
    println(names.secondOrNull())
    println(numbers.secondOrNullL())
}