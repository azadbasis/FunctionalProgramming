package inlines

inline fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

fun main() {
    val name = "Azharul Islam"
    println(modifyString(name, { it.toUpperCase() }))
    println(modifyString(name, { it}))
    println(modifyString(name) { it.toUpperCase() })
}