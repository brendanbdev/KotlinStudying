package introduction

fun main() {
//----------------------------------------------------------------------------------------------------
//  NULL SAFETY - In an effort to rid the world of 'NullPointerException', variable types in Kotlin
//  don't allow the assignment of 'null'. If you need a variable that can be null, declare it
//  nullable by adding '?' at the end of its type.


    // 1. Declares a non-null String variable.
    var neverNull: String = "This can't be null"

    // 2. When trying to assign null to non-nullable variable, a compilation error is produced.
    // neverNull = null

    // 3. Declares a nullable String variable.
    var nullable: String? = "You can keep a null here"

    // 4. Sets the null value to the nullable variable. This is OK.
    nullable = null

    // 5. When inferring types, the compiler assumes non-null for variables that are initialized with a value.
    var inferredNonNull = "The compiler assumes non-null"

    // 6. When trying to assign null to a variable with inferred type, a compilation error is produced.
    // inferredNonNull = null

    // 7. Declares a function with a non-null string parameter.
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    // 8. Calls the function with a String (non-nullable) argument. This is OK.
    strLength(neverNull)

    // 9. When calling the function with a 'String?' (nullable) argument, a compilation error is produced.
    // strLength(nullable)
}