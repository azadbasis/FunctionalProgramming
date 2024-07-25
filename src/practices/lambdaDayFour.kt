package practices

import kotlin.math.min
import kotlin.math.pow

fun main() {
    println(double(3))
}

private fun double(x: Int): Int {
    return 2 * x
}

private fun double1(x: Int) = 2 * x
private fun double2(x: Int): Int = 2 * x
private val double3 = ::double
//todo: Lambda
private val doubleL1={x:Int->2*x}
private val doubleL2:(Int)->Int={x:Int->2*x}
private val doubleL3:(Int)->Int={x->2*x}
private val doubleL4:(Int)->Int={2*it}
private val doubleL5= doubleL1
private val doubleL6:(Int)->Int= ::double

private fun powerOf(number: Int, exponent: Int): Int {
    // Implementation here
    return number.toDouble().pow(exponent).toInt()
}

private fun powerOf1(number: Int, exponent: Int) = number.toDouble().pow(exponent).toInt()
private fun powerOf2(number: Int, exponent: Int): Int = number.toDouble().pow(exponent).toInt()
private val powerOf3 = ::powerOf
//todo Lambda
private val powerOfL1={number:Int,exponent:Int->number.toDouble().pow(exponent).toInt()}
private val powerOfL2:(Int,Int)->Int={number:Int,exponent:Int->number.toDouble().pow(exponent).toInt()}
private val powerOfL3:(Int,Int)->Int={number,exponent->number.toDouble().pow(exponent).toInt()}
private val powerOfL4= powerOfL1
private val powerOfL5=:: powerOf



private fun read(b: ByteArray, off: Int = 0, len: Int = b.size) {
    for (i in off until min(off + len, b.size)) {
        val byteValue = b[i]
        println("Byte at index $i: $byteValue")
    }
}


private val read1=::read

private fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
) {
    println("String reformat")
}
private fun reformat1( str: String,
                       normalizeCase: Boolean = true,
                       upperCaseFirstLetter: Boolean = true,
                       divideByCamelHumps: Boolean = false,
                       wordSeparator: Char = ' ',)=
    println("String reformat")
private val reformat2=::reformat

private fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
) {
    println("Implement foo")
}
private fun foo1(bar:Int=0,baz:Int=1,qux:()->Unit)= println("Implement foo")
private val foo2=::foo