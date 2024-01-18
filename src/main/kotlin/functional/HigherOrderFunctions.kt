package functional

fun main() {
//----------------------------------------------------------------------------------------------------
//  HIGHER-ORDER FUNCTIONS - A higher-order function is a function that takes another function as
//  parameter and/or returns a function.

    // 1. Declares a higher-order function. It takes two integer parameters, x and y. Additionally, it
    // takes another function 'operation' as a parameter. The 'operation' parameters and return type
    // are also defined in the declaration.
    fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
        // 2. The higher order function returns the result of 'operation' invocation with the supplied
        // arguments.
        return operation(x, y)
    }

    // 3. Declares a function that matches the 'operation' signature.
    fun sum(x: Int, y: Int) = x + y

    // 4. Invokes the higher-order function passing in two integer values and the function argument
    // ::sum. :: is the notation that references a function by name in Kotlin.
    val sumResult = calculate(4, 5, ::sum)
    // 5. Invokes the higher-order function passing in a lambda as a function argument. Looks clearer,
    // doesn't it?
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")

//----------------------------------------------------------------------------------------------------
//  RETURNING FUNCTIONS:

    // 1. Declares a function matching the signature.
    fun square(x: Int) = x * x

    // 2. Declares a higher-order function that returns a function. (Int) -> Int represents the
    // parameters and return type of the 'square' function.
    fun operation(): (Int) -> Int {
        return ::square
    }

    // 3. Invokes 'func'. The 'square' function is actually executed.
    val func = operation()
    println(func(2))
}