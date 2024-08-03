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

fun <T> handleDocument(doc: T) where T : Printable, T : Savable  {
    doc.print()
    doc.save()
}
fun handleDocument1(doc:Document){
    doc.print()
    doc.save()
}

fun main() {
    val doc = Document()
    handleDocument(doc)  // This will print and save the document
   handleDocument1(doc)
}
//todo: summary
//This is particularly useful in generic programming,
// where you may need to enforce that a type parameter conforms to multiple interfaces or base classes.

/*
* Summary
handleDocument(doc) is more flexible and can accept any type that conforms to both Printable and Savable interfaces, not just Document.
handleDocument1(doc) is specific to the Document class and can't handle other types, even if they implement Printable and Savable.
* */