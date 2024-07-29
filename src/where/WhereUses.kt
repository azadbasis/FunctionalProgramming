package where

//todo: when use "where"
//When a single type parameter must satisfy multiple constraints,
// such as implementing multiple interfaces or being a subclass of a specific class and implementing an interface

interface Printable {
    fun print()
}

interface Savable {
    fun save()
}

class Document : Printable, Savable {
    override fun print() {
        println("Printing document...")
    }

    override fun save() {
        println("Saving document...")
    }
}

fun <T> handleDocument(doc: T) where T : Printable, T : Savable {
    doc.print()
    doc.save()
}

fun main() {
    val doc = Document()
    handleDocument(doc)  // This will print and save the document
}
//todo: summary
//This is particularly useful in generic programming,
// where you may need to enforce that a type parameter conforms to multiple interfaces or base classes.