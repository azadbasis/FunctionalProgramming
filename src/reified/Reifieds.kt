package reified
//todo reified: In Kotlin, **`reified`** is a keyword used with **inline functions** to access the type information at runtime.
// Normally, type information is erased during runtime in Kotlin due to type erasure.
// However, by marking a generic type parameter with `reified` in an inline function,
// you can retain the type information and use it within the function, allowing operations like type checks and casting.
// This feature is particularly useful when working with generics.

fun <T> T.myGen(itm: T): Unit {
    println(this)
}

fun <T> List<T>.secondOrNull(): T? {
    return if (size >= 2) this[1] else null
}

inline fun <reified T> printType() {
    println(T::class.java)
}

inline fun <reified T> printType1(type: T) {
    println(T::class.java)
}

fun main() {
    printType<String>()
    printType1("String")
    printType1(1)
    printType1(1.7)
    printType1(true)
    printType1('c')
}

