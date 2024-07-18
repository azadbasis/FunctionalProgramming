package practices

import kotlin.math.pow

fun doubleTh(x: Int): Int {
    return 2 * x
}

val doubleThL1 = { x: Int -> 2 * x }
val doubleThL2: (Int) -> Int = { x -> 2 * x }
val doubleThL3: (Int) -> Int = { x: Int -> 2 * x }
val doubleThL4 = doubleThL1
val doubleThL5:(Int)->Int ={it*2}
val doubleThL6 =::doubleTh


fun powerOfTh(number: Int, exponent: Int): Int {
    return number.toDouble().pow(number).toInt()
}
val powerOfThL1={number:Int,exponent:Int->number.toDouble().pow(number).toInt()}
val powerOfThL2:(Int,Int)->Int={number:Int,exponent:Int->number.toDouble().pow(number).toInt()}
val powerOfThL3:(Int,Int)->Int={number,exponent->number.toDouble().pow(number).toInt()}
val powerOfThL4=::powerOfTh


fun readTh(b: ByteArray, off: Int = 0, len: Int = b.size) {
    println("READ FILE")
}
val readThL1={b:ByteArray,off:Int,len:Int-> println("READ FILE") }
val readThL2:(ByteArray,Int,Int)->Unit={b,off,len-> println("READ FILE") }
val readThL3:(ByteArray,Int,Int)->Unit={b:ByteArray,off:Int,len:Int-> println("READ FILE") }
val readThL4=::readTh

fun reformatTh(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' '
) {
    println("TEXT REFORMAT")
}
val reformathL1={str:String,normalizeCase:Boolean,upperCaseFirstLetter:Boolean,divideByCamelHumps:Boolean,wordSeparator:Char-> println("Text format") }
val reformathL2:(String,Boolean,Boolean,Boolean,Char)->Unit={str:String,normalizeCase:Boolean,upperCaseFirstLetter:Boolean,divideByCamelHumps:Boolean,wordSeparator:Char-> println("Text format") }
val reformathL3:(String,Boolean,Boolean,Boolean,Char)->Unit={str,normalizeCase,upperCaseFirstLetter,divideByCamelHumps,wordSeparator-> println("Text format") }
val reformathL4=::reformatTh

fun fooTh(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {
    println("Hello Foo")
}

val fooThL1={bar:Int,baz:Int,qux:()->Unit-> println("Hello Foo") }
val fooThL2:(Int,Int,()->Unit)->Unit={bar:Int,baz:Int,qux:()->Unit-> println("Hello Foo") }
val fooThL3:(Int,Int,()->Unit)->Unit={bar,baz,qux-> println("Hello Foo") }
val fooThL4=::fooTh