package practices

import kotlin.math.min
import kotlin.math.pow

private fun double(x: Int): Int {
    return 2 * x
}

private fun double1(x: Int) = 2 * x
private fun double2(x: Int): Int = 2 * x
private val double3 = ::double

//todo: Lambda
private val double1: (Int) -> Int = { x -> 2 * x }
private val double2: (Int) -> Int = { x: Int -> 2 * x }
private val doubleL3: (Int) -> Int = { 2 * it }
private val double4 = double1
private val double5 = { x: Int -> 2 * x }
private val double6: (Int) -> Int = ::double1

private fun powerOfn(number: Int, exponent: Int): Int {
    // Implementation here
    return number.toDouble().pow(exponent).toInt()
}

//todo lambda
private val powerOf = { number: Int, exponent: Int -> number.toDouble().pow(exponent).toInt() }
private val powerOf1: (Int, Int) -> Int = { number: Int, exponent: Int -> number.toDouble().pow(exponent).toInt() }
private val powerOf2: (Int, Int) -> Int = { number, exponent -> number.toDouble().pow(exponent).toInt() }
private val powerOf3: (Int, Int) -> Int = ::powerOfn
private val powerOf4 = powerOf
private val powerOf5 = ::powerOfn

private fun read(b: ByteArray, off: Int = 0, len: Int = b.size) {
    for (i in off until min(off + len, b.size)) {
        val byteValue = b[i]
        println("Byte at index $i: $byteValue")
    }
}

private val readL = ::read

private fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
) {
    println("Implement foo")
}

private fun foo1(bar: Int = 0, baz: Int = 1, qux: () -> Int) = println("Implement foo")
private val foo2 = ::foo

//todo: lambda
private val fooL = { bar: Int, baz: Int, qux: () -> Unit -> println("Implement foo") }
private val fooL1: (Int, Int, () -> Unit) -> Unit = { bar: Int, baz: Int, qux: () -> Unit -> println("Implement foo") }
private val fooL2: (Int, Int, () -> Unit) -> Unit = { bar, baz, qux -> println("Implement foo") }
private val fooL3= fooL
private val fooL4=:: foo1

//todo:Extension function and Generic
private fun <T> List<T>.secondOrNull(): T? {
    return if (size >= 2) this[1] else null
}
private fun <T> List<T>.secondOrNull1(): T? = if (size >= 2) this[1] else null

//todo: Lambda
private val <T> List<T>.lambdaFunction:()->T? get() ={if (size>=2) this[1]else null}


