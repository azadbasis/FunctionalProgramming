package basic

import javax.swing.JPopupMenu.Separator
//todo:11 Named Arguments & Default Parameter Values
fun concat(texts: List<String>, separator: String = ", "): String {
    return texts.joinToString(separator)
}


fun main() {
//    val concatString= concat(listOf("Azhar","Anwar","Anis"),": ")
//    val concatString= concat(listOf("Azhar","Anwar","Anis"))
    val concatString = concat(separator = "-", texts = listOf("Azhar", "Anwar", "Anis"))//using Named Arguments, we can pass argument any order
    println(concatString)
}