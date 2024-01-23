package productivityBoosters

fun main() {
//-----------------------------------------------------------------------------------------------------
//  NAMED ARGUMENTS - As with most other programming languages (Java, C++, etc.), Kotlin supports
//  passing arguments to methods and constructors according to the order they are defined. Kotlin also
//  supports named arguments to allow clearer invocations and avoid mistakes with the order of
//  arguments. Such mistakes are hard to find because they are not detected by the compiler, for
//  example, when two sequential arguments have the same type.

    fun format(userName: String, domain: String) = "$userName@$domain"

    // 1. Calls a function with argument values.
    println(format("mario", "example.com"))

    // 2. Calls a function with switched arguments. No syntax errors, but the result
    // domain.com@username is incorrect.
    println(format("domain.com", "username"))

    // 3. Calls a function with named arguments.
    println(format(userName = "foo", domain = "bar.com"))

    // 4. When invoking a function with named arguments, you can specify them in any order you like.
    println(format(domain = "frog.com", userName = "pepe"))
}