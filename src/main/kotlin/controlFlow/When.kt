package controlFlow

fun main() {
//----------------------------------------------------------------------------------------------------
//  WHEN - Instead of the widely used 'switch' statement, Kotlin provides the more flexible and
//  clear 'when' construction. It can be used either as a statement or as an expression.

//----------------------------------------------------------------------------------------------------
//  WHEN STATEMENT:

    fun cases(obj: Any) {
        // 1. This is a 'when' statement.
        when (obj) {
            // 2. Checks whether obj equals to 1.
            1 -> println("One")

            // 3. Checks whether obj equals to "Hello".
            "Hello" -> println("Greeting")

            // 4. Performs type checking.
            is Long -> println("Long")

            // 5. Performs inverse type checking.
            !is String -> println("Not a string")

            // 6. Default statement (might be omitted).
            else -> println("Unknown")
        }
    }

    class MyClass

    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")

    // Note that all branch conditions are checked sequentially until one of them is satisfied.
    // So, only the first suitable branch will be executed.

//----------------------------------------------------------------------------------------------------
//  WHEN EXPRESSION:

    fun whenAssign(obj: Any): Any {
        // 1. This is a 'when' expression.
        val result = when (obj) {
            // 2. Sets the value to "one" if obj equals to 1.
            1 -> "one"

            // 3. Sets the value to one if obj equals to "Hello".
            "Hello" -> 1

            // 4. Sets the value to false if obj is an instance of Long.
            is Long -> false

            // 5. Sets the value 42 if none of the previous conditions are satisfied. Unlike in
            // 'when' statement, the default branch is usually required in 'when' expression, except
            // the case when the compiler can check that other branches cover all possible cases.
            else -> 42
        }
        return result
    }

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}