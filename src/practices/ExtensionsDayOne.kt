package practices

import extensions.factorial
import java.text.SimpleDateFormat
import java.util.*


fun main() {
    val name = "azharul islam"
    println(name.capitalizeFirstLetter())
    println(name.capitalizeFirstLetterL())

    val myList = listOf(10, 20, 30)
    val secondElement = myList.secondOrNullL()
    println(secondElement)
}

fun String.capitalizeFirstLetter(): String {
    return this.substring(0, 1).toUpperCase() + this.substring(1)
}

val capitalizeFirstLetterL: String.() -> String = { -> this.substring(0, 1).toUpperCase() + this.substring(1) }
val capitalizeFirstLetter3: String.() -> String = { this.substring(0, 1).toUpperCase() + this.substring(1) }
val capitalizeFirstLetterL2: String.() -> String
    get() = {
        this.substring(0, 1).toUpperCase() + this.substring(1)
    }
val capitalizeFirstLetterL1: String.() -> kotlin.String = {
    this.substring(0, 1).toUpperCase() + this.substring(1)
}
//todo : named function
private fun <T> List<T>.secondOrNull(): T? {
    return if (size >= 2) this[1] else null
}

//todo: lambda function
private val <T> List<T>.secondOrNullL: () -> T?
    get() = { if (size >= 2) this[1] else null }

private val <T> List<T>.secondOrNullL3
    get() = { if (size >= 2) this[1] else null }

private val <T>  List<T>.getSecondOrNullL2: T? get() = if (size >= 2) this[1] else null
private val <T>  List<T>.getSecondOrNullL1 get() = if (size >= 2) this[1] else null

fun Int.factorial(): Long {
    return if (this <= 1) 1 else (2..this).fold(1L) { acc, value -> acc * value }
}
fun  Int.factorial1()=if (this <= 1) 1 else (2..this).fold(1L) { acc, value -> acc * value }

//todo: Lambda
private val factorial2:Int.()->Long={if (this <= 1) 1 else (2..this).fold(1L) { acc, value -> acc * value }}
private val factorial3: Int.() -> Long
    get() = {if (this <= 1) 1 else (2..this).fold(1L) { acc, value -> acc * value }}

private fun Date.toReadableString(): String {
    val formatter = SimpleDateFormat("dd MMM yyyy", Locale.US)
    return formatter.format(this)
}
private val toReadableString1:Date.()->String={
    val formatter = SimpleDateFormat("dd MMM yyyy", Locale.US)
    formatter.format(this)
}
private val toReadableString: Date.() -> String
    get() = {
        val formatter = SimpleDateFormat("dd MMM yyyy", Locale.US)
        formatter.format(this)
    }