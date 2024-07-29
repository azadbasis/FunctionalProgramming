package inlines

// todo:What is Inline function?
// Inline function instruct compiler to insert the complete body of the function wherever that function gets used in the code.

// todo:Advantage of inline function:
// Function call overhead doesn't occur. Less overhead and faster program execution.

inline fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

fun main() {
    val name = "Azharul Islam"
    println(modifyString(name, { it.toUpperCase() }))
    println(modifyString(name, { it}))
    println(modifyString(name) { it.toUpperCase() })
}

// todo: So, when to make the function inline and when not:
//When the function code is very small, it's a good idea to make the function inline.
//When the function code is large and called from so many places, it's a bad idea to make the function inline, as the large code will be repeated again and again.

//todo:Points
//1.Kotlin scope function are all inline