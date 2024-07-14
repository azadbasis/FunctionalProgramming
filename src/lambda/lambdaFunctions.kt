package lambda

// todo basic
fun sum(n1:Int,n2:Int):Int{
    return n1+n2
}
fun sum1(n1:Int,n2:Int)=n1+n2
fun sum2(n1:Int,n2:Int):Int=n1+n2
//todo: lambda

val lam={n1:Int,n2:Int->n1+n2}
val lam1:(Int,Int)->Int={n1:Int,n2:Int->n1+n2}

//todo exercise-1 convert it with lambda
fun add(a: Int, b: Int): Int {
    return a + b
}
val addL={a:Int,b:Int->a+b}

//todo exercise-2 convert it with lambda
val isEvenL={number:Int->number%2==0}
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

//todo exercise-3 convert it with lambda

fun greet(name: String): String {
    return "Hello, $name!"
}
val  greetL={name:String->"Hello, $name"}

//todo exercise-4 convert it with lambda
fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}
val factorialL={n:Int->if (n==0) 1 else n* factorial(n-1) }

//todo exercise-5 convert it with lambda
fun findMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}
val findMaxL={a:Int,b:Int->if (a>b) a else b}

//todo exercise-6 convert it with lambda
fun isPositive(number: Int): Boolean {
    return number > 0
}
val isPositiveL:(Int)->Boolean={number:Int->number>0}

//todo exercise-7 convert it with lambda
fun reverseString(str: String): String {
    return str.reversed()
}
val reverseStringL:(String)->String={str:String->str.reversed()}

//todo exercise-8 convert it with lambda
fun calculateArea(radius: Double): Double {
    return Math.PI * radius * radius
}
val calculateAreaL:(Double)->Double={radius:Double->Math.PI*radius*radius}
//todo exercise-9 convert it with lambda
fun checkPrime(number: Int): Boolean {
    if (number <= 1) return false
    if (number <= 3) return true
    if (number % 2 == 0 || number % 3 == 0) return false
    var i = 5
    while (i * i <= number) {
        if (number % i == 0 || number % (i + 2) == 0) return false
        i += 6
    }
    return true
}
val checkPrimeL={number:Int->
    if (number <= 1)  false
    if (number <= 3)  true
    if (number % 2 == 0 || number % 3 == 0)  false
    var i = 5
    while (i * i <= number) {
        if (number % i == 0 || number % (i + 2) == 0)  false
        i += 6
    }
     true
}
//todo exercise-10 convert it with lambda
fun calculatePower(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

val calculatePowerL={base:Int,exponent:Int->
    var result=1
    for (i in 1 ..exponent){
        result*=base
    }
    result
}

fun main() {
    println(sum(1,2))
    println(sum1(2,3))
    println(sum2(5,2))
    println(lam(6,2))
    println(lam1(34,2))

    //todo exercise-1
    println("Basic- ${add(2,7)}")
    println("Lambda- ${addL(12,7)}")

    //todo exercise-2
    println("Basic- ${isEven(7)}")
    println("Lambda- ${isEvenL(12)}")

    //todo exercise-3
    println("Basic- ${greet("Azhar")}")
    println("Lambda- ${greetL("Azharul Islam")}")

    //todo exercise-4
    println("Basic- ${factorial(4)}")
    println("Lambda- ${factorialL(3)}")

    //todo exercise-5
    println("Basic- ${findMax(4,6)}")
    println("Lambda- ${findMaxL(31,6)}")
}

