package introduction

fun main() {
//----------------------------------------------------------------------------------------------------
//  FUNCTIONS:
    println("\nFUNCTIONS: ")

    // 1. A simple function that takes a parameter of type String and returns Unit (i.e., no return
    // value).
    fun printMessage(message: String): Unit {
        println(message)
    }

    // 2. A function that takes a second optional parameter with default value Info. The return type
    // is omitted, meaning that it's actually Unit.
    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    // 3. A function that returns an integer.
    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    // 4. A single-expression function that returns an integer (inferred).
    fun multiply(x: Int, y: Int) = x * y

    // 5. Calls the first function with the argument Hello.
    printMessage("Hello")

    // 6. Calls the function with two parameters, passing values for both of them.
    printMessageWithPrefix("Hello", "Log")

    // 7. Calls the same function omitting the second one. The default value Info is used.
    printMessageWithPrefix("Hello")

    // 8. Calls the same function using named arguments and changing the order of the arguments.
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    // 9. Prints the result of the sum function call.
    println(sum(1, 2))

    // 10. Prints the result of the multiply function call.
    println(multiply(2, 4))

//----------------------------------------------------------------------------------------------------
//  INFIX FUNCTIONS - Member functions and extensions with a single parameter can be turned into
//  infix functions.
    println("\nINFIX FUNCTIONS: ")

    /*
    1. Defines an infix extension function on Int. - You are creating a new extension function for
    Int, so instances of Int can call this function. For example, without using infix notation, this
    would print "HelloHelloHello":

    infix fun Int.myTimesFun(str: String) = str.repeat(this)
    val myInt = 3
    println(myInt.myTimesFun("Hello"))

    With infix notation:

    infix fun Int.myTimesFun(str: String) = str.repeat(this)
    println(3 myTimesFun "Hello")

    No. 5 & 6 show an example of defining an infix function inside the class.
    */
    infix fun Int.myTimesFun(str: String) = str.repeat(this)

    // 2. Calls the infix function.
    println(2 myTimesFun "Bye ")

    // 3. Creates a Pair by calling the infix function 'to' from the standard library.
    val pair = "Ferrari" to "Katrina"
    println(pair)

    // 4. Here's your own implementation of 'to' creatively called 'onto'.
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    // 5. The containing class becomes the first parameter.
    class Person(val name: String) {
        val likedPeople = mutableListOf<Person>()
        infix fun likes(other: Person) { likedPeople.add(other) }
    }

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    // 6. Infix notation also works on members functions (methods).
    sophia likes claudia

//----------------------------------------------------------------------------------------------------
//  OPERATOR FUNCTIONS - Certain functions can be "upgraded" to operators, allowing their calls with
//  the corresponding operator symbol. All operators and corresponding method names can be found here:
//  https://kotlinlang.org/docs/operator-overloading.html
    println("\nOPERATOR FUNCTIONS: ")

    // 1. This takes the infix function from above one step further using the 'operator' modifier.
    operator fun Int.times(str: String) = str.repeat(this)

    // 2. The operator symbol for times() is '*' so that you can call the function using '2 * "Bye "'.
    println(2 * "Bye ")

    // 3. An operator function allows easy range access on strings.
    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."

    // 4. The get() operator enables bracket-access syntax.
    println(str[0..14])

//----------------------------------------------------------------------------------------------------
//  FUNCTIONS WITH 'VARARG' PARAMETERS - Varargs allow you to pass any number of arguments by
//  separating them with commas.
    println("\nFUNCTIONS WITH 'VARARG' PARAMETERS: ")

    // 1. The 'vararg' modifier turns a parameter into a vararg.
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }

    // 2. This allows calling 'printAll' with any number of string arguments.
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    // 3. Thanks to named parameters, you can even add another parameter of the same type after the
    // vararg. This wouldn't be allowed in Java because there's no way to pass a value.
    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        // 4. Using named parameters, you can set a value to 'prefix' separately from the vararg.
        prefix = "Greeting: "
    )

    fun log(vararg entries: String) {
        // 5. At runtime, a vararg is just an array. To pass it along into a vararg parameter, use
        // the special spread operator * that lets you pass in *entries (a vararg of String) instead
        // of entries (an Array<String>).
        printAll(*entries)
    }

    log("Hello", "Hallo", "Salut", "Hola", "你好")
}
