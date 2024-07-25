package extensions

import com.sun.tools.javac.util.Context
import java.text.SimpleDateFormat
import java.util.*

// todo:  In Kotlin, extension functions allow you to add new functionality to existing classes without modifying their source code.

/*
* Adding Utility Methods:
Suppose you want to add a utility method to the String class to capitalize the first letter of a string
* */

fun String.capitalizeFirstLetter(): String {
    return this.substring(0, 1).toUpperCase() + this.substring(1)
}

//AS LAMBDA
val capitalizeFirstLetterL: String.() -> String = {
    this.substring(0, 1).toUpperCase() + this.substring(1)
}



/*
* Customizing Existing Classes:
You can extend existing classes to provide custom behavior. For example, let’s add
*  a method to the List interface that returns the second element (if available):
* */

fun <T> List<T>.secondOrNull(): T? {
    return if (size >= 2) this[1] else null
}
//AS LAMBDA
//val secondOrNullL:List<T>.()->T?={if(size>=2) this[1] else null}
private val <T> List<T>.secondOrNullL: () -> T?
    get() = { if (size >= 2) this[1] else null }

/*
*  Domain-Specific Extensions:
Create extensions specific to your domain. Here’s
* an extension function for calculating the factorial of an Int:
* */
fun Int.factorial(): Long {
    return if (this <= 1) 1 else (2..this).fold(1L) { acc, value -> acc * value }
}
val factorialL:Int.()->Long={if (this <= 1) 1 else (2..this).fold(1L) { acc, value -> acc * value }}


/*
* Enhancing External Libraries:
Extend classes from external libraries. For instance, let’s add a method to
* the Date class to format it as a readable string:
* */

fun Date.toReadableString(): String {
    val formatter = SimpleDateFormat("dd MMM yyyy", Locale.US)
    return formatter.format(this)
}
val toReadableStringL:Date.()->String={
    val formatter = SimpleDateFormat("dd MMM yyyy", Locale.US)
    formatter.format(this)
}


fun main() {

    // Usage:
    val originalString = "hello, world"
    val capitalized = originalString.capitalizeFirstLetter()
    println(capitalized) // Output: "Hello, world"

   // Usage:
    val myList = listOf(10, 20, 30)
    val secondElement = myList.secondOrNullL()
    println(secondElement)

    // Usage:
    val number = 5
    val factorial = number.factorialL()
    println("Factorial of $number is $factorial")

   // Usage:
    val currentDate = Date()
    val readableDate = currentDate.toReadableStringL()
    println("Today's date: $readableDate") // Output: e.g., "Today's date: 18 Jul 2024"


}
