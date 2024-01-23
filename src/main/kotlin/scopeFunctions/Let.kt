package scopeFunctions

fun main() {
//-----------------------------------------------------------------------------------------------------
//  LET - The Kotlin standard library function 'let' can be used for scoping and null-checks. When
//  called on an object, 'let' executes the given block of code and returns the result of its last
//  expression. The object is accessible inside the block by the reference 'it' (by default) or a
//  custom name.

    fun customPrint(s: String) {
        print(s.uppercase())
    }

    // 1. Calls the given block on the result on the string "test".
    val empty = "test".let {
        // 2. Calls the function on "test" by the 'it' reference.
        customPrint(it)
        // 3. 'let' returns the value of this expression.
        it.isEmpty()
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        // 4. Uses safe call, so 'let' and its code block will be executed only on non-null values.
        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        // 5. Uses the custom name instead of 'it', so that the nested 'let' can access the context
        // object of the outer 'let'.
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")
}