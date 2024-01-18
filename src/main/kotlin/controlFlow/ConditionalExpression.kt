package controlFlow

fun main() {
//----------------------------------------------------------------------------------------------------
//  CONDITIONAL EXPRESSION - There is no ternary operator 'condition ? then : else' in Kotlin.
//  Instead, 'if' may be used as an expression:

    // 'if' is an expression here: it returns a value.
    fun max(a: Int, b: Int) = if (a > b) a else b
    println(max(99, -42))
}