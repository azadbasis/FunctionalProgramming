package higherOrder

fun main() {
    val cupcake: (Int) -> Unit = { println("You get $it cupcake!") }
    val coins: (Int) -> Unit = { println("You get $it coins") }

   //Using named function
    val treatFunction = treatOrTrick(true, cupcake)
 //   val trickFunction = treatOrTrick(false, coins)

    treatFunction()
   // trickFunction()

//todo: Using lambda
 //   val treatFunctionL= treatOrTrickLambda(true,cupcake)
    val trickFunctionL= treatOrTrickLambda(false,coins)

//    treatFunctionL()
    trickFunctionL()
}

private fun treatOrTrick(isTrick: Boolean, extraTreat: (Int) -> Unit): () -> Unit {
    if (isTrick) {
        extraTreat(8)
        return trick
    } else {
        extraTreat(3)
        return treat
    }
}
private val treatOrTrickLambda:(Boolean,(Int)->Unit)->()->Unit={ isTrick,extraTreat->
    if (isTrick){
        extraTreat(5)
        trick
    }else{
        extraTreat(3)
        treat
    }
}

private val treat = { println("Have a treat!") }
private val trick = { println("No treat!") }