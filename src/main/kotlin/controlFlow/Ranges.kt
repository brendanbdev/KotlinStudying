package controlFlow

fun main() {
//----------------------------------------------------------------------------------------------------
//  RANGES - There is a set of tools for defining ranges in Kotlin. Let's have a brief look at them.

    // 1. Iterates over a range starting from 0 up to 3 (inclusive). Like 'for(i=0; i<=3; ++i)' in
    // other programming languages (C/C++/Java). (So 3..0 would be an empty range) Prints 0123
    for(i in 0..3) {
        print(i)
    }
    print(" ")

    // 2. Iterates over a range starting from 0 up to 3 (exclusive). Like for loop in Python or like
    // 'for(i=0; i<3; ++i)' in other programming languages (C/C++/Java). Prints 012
    for(i in 0 until 3) {
        print(i)
    }
    print(" ")

    // 3. Iterates over a range with a custom increment step for consecutive elements. Prints 2468
    // ('step 5' would print 27)
    for(i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    // 4. Iterates over a range in reverse order. Prints 3210
    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")

    // Char ranges are also supported:

    // Iterates over a char range in alphabetical order. Prints abcd
    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    // Char ranges support 'step' and 'downTo' as well. Prints zxvt
    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")

    // Ranges are also useful in 'if' statements:

    val x = 2
    // Checks if a value is in the range.
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    // '!in' is the opposite of 'in'.
    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }
}