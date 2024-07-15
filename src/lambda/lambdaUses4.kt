package lambda

fun main(){
    val coins:(Int)->String={"$it quarters!"}
    val cupCake:(Int)->String={"Have a cupCake"}
    val treatFunction= treatOrTrick(true,coins)
    val trickFunction= treatOrTrick(false,null)
    treatFunction()
    trickFunction()
}

private fun treatOrTrick(isTrick:Boolean,extraTreat:((Int)->String)?):()->Unit{
    if (isTrick){
        if (extraTreat!=null){
            extraTreat(4)
        }
        return trick
    }else{
        if (extraTreat!=null){
            extraTreat(4)
        }
        return treat
    }
}
private val treat={ println("Have a treat!") }
private val trick={ println("No treat!") }