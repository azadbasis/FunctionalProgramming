package lambda

fun main(){
//val  trickFunction= trick()
    /* todo The :: operator in Kotlin is called the callable reference operator.
        It is used to refer to functions, properties, and constructors by their names.*/
/*val  trickFunction= ::trick
    trickFunction()*/

    // todo: with the lambda expression , I can store function directly in the variable without using a function reference.
/*val trickFunction= trickLambda
    trickFunction()
     treat()*/
    val trickFunction= trickOrTreat(true)
    val treatFunction= trickOrTreat(false)
    treatFunction()
    trickFunction()

}
//todo  higher-order function.
fun trickOrTreat(isTrick:Boolean):() -> Unit{
    if (isTrick)
        return trickLambda
    else
        return treat
}


fun trick(){
    println("Named function-No tricks!")
}

//with the lambda expression , I can store function directly in the variable without using a function reference.
val  trickLambda={ println("No tricks!")}

val treat:()->Unit={
    println("Have a treat!")
}
