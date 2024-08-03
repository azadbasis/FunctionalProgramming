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

/*
* Consider the following scenario: You have an inline function that takes a lambda as a parameter.
* Without the crossinline modifier, the lambda could potentially use non-local returns, which might not be the desired behavior.
* The crossinline modifier ensures that the lambda cannot perform such non-local returns.
* */