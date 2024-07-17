package practices

import kotlin.math.min
import kotlin.math.pow

//todo:1 Standard function definition with a block body:
fun double(x: Int): Int {
    return 2 * x
}

//TODO:2 Single-expression function with type inference:
fun doubleN1(x: Int) = 2 * x

//TODO:3 Single-expression function with explicit return type:
fun doubleN2(x: Int): Int = 2 * x

//todo:1. Lambda expression with inferred type:
private val doubleL1 = { x: Int -> 2 * x }

//todo:2. Lambda expression with explicit type declaration:
private val doubleL2: (Int) -> Int = { x -> 2 * x }

//todo:3. Lambda expression using it (implicit name of the single parameter):
private val doubleL3: (Int) -> Int = { 2 * it }

//todo:4. Lambda with explicit type declaration and a function reference:
private val doubleL4: (Int) -> Int = { x: Int -> 2 * x }

//todo:5. Function reference (if a named function exists):
private val doubleL5: (Int) -> Int = ::double


fun powerOf(number: Int, exponent: Int): Int {
    // Implementation here
    return number.toDouble().pow(exponent).toInt()
}

fun powerOfN1(number: Int, exponent: Int) = number.times(exponent)
fun powerOfN2(number: Int, exponent: Int): Int = number.times(exponent)

//todo:LAMBDA
private val powerOfL1 = { number: Int, exponent: Int -> number.toDouble().pow(exponent).toInt()}
private val powerOfL2:(Int,Int)->Int = { number: Int, exponent: Int ->number.toDouble().pow(exponent).toInt()}
private val powerOfL3:(Int,Int)->Int = { number, exponent -> number.toDouble().pow(exponent).toInt() }
private val powerOfL4:(Int,Int)->Int = ::powerOf

fun read(b: ByteArray, off: Int = 0, len: Int = b.size) {
    for (i in off until min(off + len, b.size)) {
        val byteValue = b[i]
        println("Byte at index $i: $byteValue")
    }
}
fun readN1(b: ByteArray, off: Int = 0, len: Int = b.size) =
    (off until min(off + len, b.size)).forEach { i ->
        val byteValue = b[i]
        println("Byte at index $i: $byteValue")
    }
fun readN2(b: ByteArray, off: Int = 0, len: Int = b.size): Unit =
    (off until min(off + len, b.size)).forEach { i ->
        val byteValue = b[i]
        println("Byte at index $i: $byteValue")
    }
//todo:LAMBDA
//// Default parameter values can't be directly handled within a lambda, so create an extension function to manage default values
private  val readL1:(ByteArray,Int,Int)->Unit = { b:ByteArray,off:Int,len:Int->
    for (i in off until min(off + len, b.size)) {
        val byteValue = b[i]
        println("Byte at index $i: $byteValue")
    }
}

private  val readL2:(ByteArray,Int,Int)->Unit = { b,off,len->
    for (i in off until min(off + len, b.size)) {
        val byteValue = b[i]
        println("Byte at index $i: $byteValue")
    }
}
private  val readL3:(ByteArray,Int,Int)->Unit = ::read

fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' '
) {
    println("String reformat")
}
fun reformatN1(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' '
): Unit {
    println("String reformat")
}
fun reformatN2(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' '
): Unit = println("String reformat")

fun reformatN3(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' '
) = println("String reformat")

//todo: Lambda
private val reformatL1={str:String,normalizeCase:Boolean,upperCaseFirstLetter:Boolean,divideByCamelHumps:Boolean,wordSeparator:Char->
    println("String reformat")
}
private val reformatL2:(String,Boolean,Boolean,Boolean,Char)->Unit={str,normalizeCase,upperCaseFirstLetter,divideByCamelHumps,wordSeparator->
    println("String reformat")
}
private val reformatL3=::reformat

fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit
) {
    println("Implement foo")
}

fun fooN1(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit
): Unit {
    println("Implement foo")
}

fun fooN2(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit
): Unit = println("Implement foo")

fun fooN3(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit
) = println("Implement foo")
//TODO: LAMBDA
private val fooL1={bar:Int,baz:Int,qux:()->Unit->println("Implement foo")}
private val fooL2:(Int,Int,()->Unit)->Unit={bar,baz,qux->println("Implement foo")}
private val fooL3=::foo
fun main() {

}