package practices

import kotlin.math.pow

fun doubleT(x: Int): Int { return 2 * x }
fun doubleT1(x: Int) = 2 * x
fun doubleT2(x: Int):Int = 2 * x
val doubleTFunc1:(x: Int)->Int = ::doubleT
val doubleTFun2= ::doubleT
val doubleTFunc3:(Int)->Int =
     ::doubleT

fun powerOfT(number: Int, exponent: Int): Int { return number.toDouble().pow(number).toInt() }
fun powerOfT1(number: Int,exponent: Int):Int=number.toDouble().pow(number).toInt()
fun powerOfT2(number: Int,exponent: Int)=number.toDouble().pow(number).toInt()
val powerOfTFunc1=::powerOfT
val powerOfTFunc2:(Int,Int)->Int=::powerOfT
val powerOfTFunc3:(number:Int,exponent:Int)->Int=::powerOfT

fun readT(b: ByteArray, off: Int = 0, len: Int = b.size) { println("READ FILE") }
fun readT1(b:ByteArray,off: Int=0,len: Int=b.size):Unit= println("READ FILE")
fun readT2(b:ByteArray,off: Int=0,len: Int=b.size)= println("READ FILE")
val readTFunc1=::readT
val readTFunc2:(b:ByteArray,off:Int,len:Int)->Unit=::readT
val readTFunc3:(ByteArray,Int,Int)->Unit=::readT

fun reformatT(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' '
) {
  println("TEXT REFORMAT")
}
fun reformatT1(str:String,normalizeCase: Boolean=true,upperCaseFirstLetter: Boolean=true,divideByCamelHumps: Boolean=false,wordSeparator: Char=' '):Unit=
    println("TEXT REFORMAT")
fun reformatT2(str:String,normalizeCase: Boolean=true,upperCaseFirstLetter: Boolean=true,divideByCamelHumps: Boolean=false,wordSeparator: Char=' ')=
    println("TEXT REFORMAT")
val reformatTFunc1=::reformatT
val reformatTFunc2:(str:String,normalizeCase:Boolean,upperCaseFirstLetter:Boolean,divideByCamelHumps:Boolean,wordSeparator:Char)->Unit=::reformatT
val reformatTFunc3:(String,Boolean,Boolean,Boolean,Char)->Unit=::reformatT

fun fooT(bar: Int = 0, baz: Int = 1, qux: () -> Unit) { println("Hello Foo") }
fun fooT1(bar:Int=0,baz:Int=1,qux: () -> Unit):Unit= println("Hello Foo")
fun fooT2(bar:Int=0,baz:Int=1,qux: () -> Unit)= println("Hello Foo")
val footFunc1=::fooT
val footFunc2:(bar:Int,baz:Int,qux:()->Unit)->Unit=::fooT
val footFunc3:(Int,Int,()->Unit)->Unit=::fooT

