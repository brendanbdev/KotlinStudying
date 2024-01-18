package specialClasses

//----------------------------------------------------------------------------------------------------
//  SEALED CLASSES - Sealed classes let you restrict the use of inheritance. Once you declare a class
//  sealed, it can only be subclassed from inside the same package where the sealed class is declared.

// 1. Defines a sealed class.
sealed class Mammal(val name: String)

// 2. Defines subclasses. Note that all subclasses must be in the same package.
class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    // 3. Uses an instance of the sealed class as an argument in a 'when' expression.
    when (mammal) {
        // 4. A smartcast is performed, casting 'Mammal' to 'Human'.
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        // 5. A smartcast is performed, casting 'Mammal' to 'Cat'.
        is Cat -> return "Hello ${mammal.name}"
        // 6. The else-case is not necessary here since all possible subclasses of the sealed class
        // are covered. With a non-sealed superclass 'else' would be required.
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}