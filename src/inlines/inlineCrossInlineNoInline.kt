package inlines

import java.lang.Thread.sleep

fun main() {
    processRecords("Azhar", "Anwar", "Anis")
}

fun processRecords(vararg records: String) {
    for (record in records) {
        executeAndMeasure(record) {
            save(record)
        }
    }
}

fun save(record: String) {
    sleep(500)
    println("Saved $record!")
}

fun executeAndMeasure(label: String, block: () -> Unit) {
    val start = System.nanoTime()
    block()
    val end = System.nanoTime()
    println("Duration for $label: ${(start - end) / 1000_000} ms")

}