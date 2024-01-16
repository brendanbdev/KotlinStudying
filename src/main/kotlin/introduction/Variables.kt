package introduction

fun main() {
//----------------------------------------------------------------------------------------------------
//  VARIABLES - Kotlin has powerful type inference. While you can explicitly declare the type of a
//  variable, you'll usually let the compiler do the work by inferring it. Kotlin does not enforce
//  immutability, though it is recommended. In essence use val over var.

    // 1. Declares a mutable variable and initializes it.
    var a: String = "initial"
    println(a)

    // 2. Declares an immutable variable and initializes it.
    val b: Int = 1

    // 3. Declares an immutable variable and initializes it without specifying the type. The compiler
    // infers the type Int.
    val c = 3

//----------------------------------------------------------------------------------------------------

    // 1. Declares a variable without initialization.
    var e: Int

    // 2. An attempt to use the variable causes a compiler error: Variable 'e' must be initialized:
    // println(e)

//----------------------------------------------------------------------------------------------------
//  You're free to choose when you initialize a variable, however, it must be initialized before the
//  first read.

    // 1. Declares a variable without initialization.
    val d: Int  // 1

    // 2. Initializes the variable with different values depending on some condition.
    if (true) {
        d = 1
    } else {
        d = 2
    }

    // 3. Reading the variable is possible because it's already been initialized.
    println(d)
}
