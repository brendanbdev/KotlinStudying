package controlFlow

fun main() {
//----------------------------------------------------------------------------------------------------
//  LOOPS - Kotlin supports all the commonly used loops: for, while, do-while

//----------------------------------------------------------------------------------------------------
//  FOR - 'for' in Kotlin works the same way as in most languages.

    val cakes = listOf("carrot", "cheese", "chocolate")

    // Loops through each cake in the list.
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

//----------------------------------------------------------------------------------------------------
//  WHILE AND DO-WHILE - 'while' and 'do-while' constructs work similarly to most languages as well.

    fun eatACake() = println("Eat a Cake")
    fun bakeACake() = println("Bake a Cake")


    var cakesEaten = 0
    var cakesBaked = 0

    // 1. Executes the block while the condition is true.
    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    }

    // 2. Executes the block first and then checking the condition.
    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

//----------------------------------------------------------------------------------------------------
//  ITERATORS - You can define your own iterators in your classes by implementing the 'iterator'
//  operator in them.

    class Animal(val name: String)

    class Zoo(val animals: List<Animal>) {
        /*
        1. Defines an iterator in a class. It must be named 'iterator', have the 'operator' modifier,
        and of course implement the 'Iterator' interface. This is so that when a function is looking
        for an 'Iterator' on an instance of 'Zoo' it will find this iterator function.
        */
        operator fun iterator(): Iterator<Animal> {
            /*
            2. Returns the List's iterator (because 'animals' is a List) that meets the following
            method requirements (you could also define these yourself):
            - next(): Animal
            - hasNext(): Boolean
            */
            return animals.iterator()
        }

        /*
        This would be the function if you wanted to define your own hasNext() and next():
        return object : Iterator<Animal> {
            private var index = 0

            override fun hasNext(): Boolean {
                return index < animals.size
            }

            override fun next(): Animal {
                if (!hasNext()) throw NoSuchElementException()
                return animals[index++]
            }
        }
        */
    }

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    // 3. Loops through animals in the zoo with the user-defined iterator.
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

    // The iterator can also be declared as an extension function:
    fun List<Animal>.customIterator(): Iterator<Animal> {
        return object : Iterator<Animal> {
            private var index = 0

            override fun hasNext(): Boolean {
                return index < size
            }

            override fun next(): Animal {
                if (!hasNext()) throw NoSuchElementException()
                return get(index++)
            }
        }
    }
}
