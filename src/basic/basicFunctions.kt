package basic

fun permitEntrance1(age: Int): Boolean {
    return age >= 18
}

fun greetings1(msg: String) {
    println("$msg, you are welcome here!")
}

fun greetings2(msg: String): Unit {
    println("$msg, you are welcome here!")
}

/*Single Expression Functions: */
fun permitEntrance2(age: Int): Boolean = age >= 18
fun permitEntrance3(age: Int) = age >= 18


/*Shorthand Single Expression Functions:*/
fun greetings3(msg: String) = println("$msg, you are welcome here!")

/*Lambda Expressions:*/
val permitEntranceLambda1: (Int) -> Boolean = { age -> age >= 18 }
val permitEntranceLambda2: (Int) -> Boolean = { it >= 18 }
val permitEntranceLambda3: (Int) -> Boolean =
    ::permitEntrance1/*The :: operator in Kotlin is called the callable reference operator. It is used to refer to functions, properties, and constructors by their names. */
val tryLambda = { it: Int -> it >= 18 }
val tryLambda1:(Int)->Boolean = { it: Int -> it >= 18 }

val greetingsLambda: (String) -> Unit = { msg -> println("$msg, you are welcome here!") }

/*Anonymous Functions:*/
val permitEntranceAnon = fun(age: Int): Boolean {
    return age >= 18
}

val greetingsAnon = fun(msg: String): Unit {
    println("$msg, you are welcome here!")
}

/*Extension Functions:*/
fun Int.canEnter(): Boolean = this >= 18
fun String.greet() = println("$this, you are welcome here!")

/*Using Function Types as Parameters:*/
fun checkEntrance(age: Int, permit: (Int) -> Boolean): Boolean {
    return permit(age)
}

// Function that takes another function as a parameter
fun welcomeMessage(msg: String, greet: (String) -> Unit) {
    greet(msg)
}

fun main() {

    val granted = permitEntrance1(10)
    println(granted)
    greetings1("Kotlin")
    greetings3("Function")
    /*Lambda Expressions:*/
    println(permitEntranceLambda1(16))
    greetingsLambda("Lambda Expressions:")
    println(" try=${tryLambda(87)}")
    /*Anonymous Functions:*/
    println(permitEntranceAnon(20))
    greetingsAnon("Anonymous Functions:")

    /*Extension Functions:*/
    val age = 10
    println(age.canEnter())
    "Kotlin".greet()
    "Function".greet()

    /*Using Function Types as Parameters:*/
    val isAllowed = checkEntrance(20) { it >= 18 }
    println(isAllowed)

    // Using greetings1 as the function parameter
    welcomeMessage("Kotlin", ::greetings1)

    // You can also use lambda expressions or anonymous functions
    welcomeMessage("Lambda", { println("$it, you are welcome here!") })
}