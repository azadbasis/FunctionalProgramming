package lambda

fun main(){

    //todo: I didn't call treats or trick function directly
    val treatFunction= treatsOrTrick(true)
    val trickFunction= treatsOrTrick(false)
    treatFunction()
    trickFunction()

}

fun treatsOrTrick(isTrick:Boolean):()->Unit{
    if (isTrick)
        return treats
    else
        return trick
}

private val treats = { println("Have a treat!") }
private val trick:()->Unit = { println("No treats") }