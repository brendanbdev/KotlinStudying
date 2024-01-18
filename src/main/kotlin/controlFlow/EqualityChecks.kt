package controlFlow

fun main() {
//----------------------------------------------------------------------------------------------------
//  EQUALITY CHECKS - Kotlin uses == for structural comparison and === for referential comparison.
//  More precisely, a == b compiles down to if (a == null) b == null else a.equals(b).

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    // 1. Returns true because it calls authors.equals(writers) and sets ignore element order.
    println(authors == writers)
    // 2. Returns false because 'authors' and 'writers' are distinct references.
    println(authors === writers)
}