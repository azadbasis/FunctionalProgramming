package lambda

fun main() {
    val coins: (Int) -> String = { "$it quarters" }
    val cupCake: (Int) -> String = { "Have a cupCake" }
    val treatFunction = treatOrTrick(false, coins)
    val trickFunction = treatOrTrick(true, cupCake)
    treatFunction()
    trickFunction()
}

private fun treatOrTrick(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        println(extraTreat(5))
        return trick
    } else {
        println(extraTreat(5))
        return treats
    }
}

private val treats = { println("Have a treat!") }
private val trick = { println("No treat!") }