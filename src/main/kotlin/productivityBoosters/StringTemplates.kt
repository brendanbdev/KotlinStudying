package productivityBoosters

fun main() {
//-----------------------------------------------------------------------------------------------------
//  STRING TEMPLATES - String templates allow you to include variable references and expressions into
//  strings. When the value of a string is requested (for example, by 'println'), all references and
//  expressions are substituted with actual values.

    val greeting = "Kotliner"

    // 1. Prints a string with a variable reference. References in strings start with '$'.
    println("Hello $greeting")

    // 2. Prints a string with an expression. Expressions start with '$' and are enclosed in curly
    // braces.
    println("Hello ${greeting.uppercase()}")
}