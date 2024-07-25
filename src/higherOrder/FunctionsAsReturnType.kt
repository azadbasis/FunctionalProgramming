package higherOrder


fun main() {
    //todo: I didn't call treats or trick function directly

    val treatFunction = treatOrTrick(true)
    val trickFunction = treatOrTrick(false)
    treatFunction()
    trickFunction()


    val treatFunctionL = treatOrTrickL(true)
    val trickFunctionL = treatOrTrickL(false)
    treatFunctionL()
    trickFunctionL()

}

//todo:Named function, Return TYPE function; SO IT'S  HIGHER ORDER FUNCTION
private fun treatOrTrick(isTrick: Boolean): () -> Unit {
    if (isTrick)
        return trick
    else
        return treat
}

//todo:Lambda function, Return TYPE function; SO IT'S  HIGHER ORDER FUNCTION
private val treatOrTrickL: (Boolean) -> () -> Unit = { isTrick ->
    if (isTrick)
        trick
    else
        treat
}

private val treat = {
    println("Have a treat!")
}
private val trick = { println("No treat!") }