package crossinlines
//todo Prevent Non-Local Returns:
// In Kotlin, the crossinline modifier is used in the context of inline functions to prevent non-local returns from a lambda parameter.

fun doSomething()
{
    println("Before lambda")
    doSomethingElse {
        println("Inside lambda")
        //  return                  // Error: non-local return
        return@doSomethingElse  // OK: local return
    }
    println("After lambda")

}

inline fun doSomethingElse(crossinline lambda: () -> Unit) {
    println("Do something else")
    lambda()
}



fun main() {
    doSomething()
}