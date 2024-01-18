package specialClasses

//----------------------------------------------------------------------------------------------------
//  ENUM CLASSES - Enum classes are used to model types that represent a finite set of distinct
//  values, such as directions, states, modes, and so forth.

enum class State {
    // Defines a simple enum class with three enum constants. The number of constants is always
    // finite, and they are all distinct.
    IDLE, RUNNING, FINISHED
}

// Defines an enum class with a property and a method.
enum class Color(val rgb: Int) {
    // Each enum constant must pass an argument for the constructor parameter.
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    /*
    Enum class members are separated from the constant definitions by a semicolon. The logic of this
    function has nothing to do with enum classes, but I will explain it here: This function uses the
    bitwise operation 'and' to see if the hexadecimal value in 'this.rgb' contains any red at all,
    even a tint or shade. Basically, this is true when a hexadecimal value has any value where red's
    "FF" is. This is an example of how the 'and' operation works (only matching 1's result in 1):
    101010100000000000000000   (0xAA0000) (Dark Red)
    111111110000000000000000   (0xFF0000) (Red)

    101010100000000000000000   (result) (!=0, contains Red)
    -------------------------------------
    111111111111111100000000   (0xFFFF00) (Yellow)
    111111110000000000000000   (0xFF0000) (Red)

    111111110000000000000000   (result) (!=0, contains Red)
    -------------------------------------
    000000001111111100000000   (0x00FF00) (Green)
    111111110000000000000000   (0xFF0000) (Red)

    000000000000000000000000   (result) (==0, does not contain Red)
*/
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    // Accesses an enum constant via the class name.
    val state = State.RUNNING
    // With enums, the compiler can infer if a when-expression is exhaustive so that you don't need
    // the else-case.
    val message = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    val red = Color.RED
    // The default toString returns the name of the constant, here "RED".
    println(red)
    // Calls a method on an enum constant.
    println(red.containsRed())
    // Calls a method via enum class name.
    println(Color.BLUE.containsRed())
    // The RGB values of RED and YELLOW share first bits (FF) so this prints 'true'.
    println(Color.YELLOW.containsRed())
}