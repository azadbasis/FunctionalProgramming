package lambda

//todo: 1. Lambda expression use directly into the function
// 2. Use trailing lambda when lambda is a last parameter
// 3.Repeat function is a concise way to express for loop
fun main(){
//    val coins:(Int)->String={quantity->"$quantity quarters!"}
    val coins:(Int)->String={"$it quarters!"}
    val cupCake:(Int)->String={"Have a cupCake"}

    //todo 1. Lambda expression use directly into the function
//    val treatFunction= treatOrTrick(false,{"$it quarters!"})

  //todo  2. Use trailing lambda when lambda is a last parameter
    val treatFunction= treatOrTrick(false){"$it quarters!"}

    val trickFunction= treatOrTrick(true,null)

    //todo 3.Repeat function is a concise way to express for loop(Use trailing lambda)
    repeat(4){
        treatFunction()
    }

    repeat(3,{trickFunction()})
//    trickFunction()
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
