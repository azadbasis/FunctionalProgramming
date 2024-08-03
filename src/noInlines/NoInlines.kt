package noInlines

//todo: If you need to keep a reference to a lambda or pass it as an argument or another function, use that no inline keyword
fun higherOrderFunction(operation: () -> Unit) {
    operation()
}

inline fun anotherFunction(noinline operation: () -> Unit) {
    // Here we can store the lambda or pass it around as needed
    higherOrderFunction(operation)
}

fun main() {
    val printHello = {
        println("Hello, World!")
    }

    // Pass the lambda to the higher-order function
    anotherFunction(printHello)
}

/*
 When to Use noinline
Function composition: When you need to combine or store lambdas.
Callbacks: When passing lambdas as callbacks to other functions or APIs.
Avoiding code bloat: When the lambda code is large, and inlining would result in significant code duplication.
* */