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

val treats = { println("Have a treat!") }
val trick:()->Unit = { println("No treats") }