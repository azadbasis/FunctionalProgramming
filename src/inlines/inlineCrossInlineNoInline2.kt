package inlines

fun doSomething() {
    println("Before lambda")
    doSomethingElse {
        println("Inside lambda")
        //  return                  // Error: non-local return
        return@doSomethingElse  // OK: local return
    }
    println("After lambda")

  doSomethingWithNoInline({
      println("Do with inline")
  },{
      println("Do with no inline")
  })
}
//todo Prevent Non-Local Returns:
// In Kotlin, the crossinline modifier is used in the context of inline functions to prevent non-local returns from a lambda parameter.

inline fun doSomethingElse(crossinline lambda: () -> Unit) {
    println("Do something else")
    lambda()
}

/* todo:
* When to Use noinline
Function composition: When you need to combine or store lambdas.
Callbacks: When passing lambdas as callbacks to other functions or APIs.
Avoiding code bloat: When the lambda code is large, and inlining would result in significant code duplication.
*  */
inline fun doSomethingWithNoInline( f1: () -> Unit, noinline f2: () -> Unit) {
    f1()
    f2.invoke()
}

fun main() {
    doSomething()
}