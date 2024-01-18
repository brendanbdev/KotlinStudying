package introduction

fun main() {
//----------------------------------------------------------------------------------------------------
//  GENERICS - Generics are a genericity mechanism that's become standard in modern languages. Generic
//  classes and functions increase code reusability by encapsulating common logic that is independent
//  of a particular generic type, like the logic inside a List<T> is independent of what T is.

//----------------------------------------------------------------------------------------------------
//  GENERIC CLASSES - The first way to use generics in Kotlin is creating generic classes.

    // Note that the implementation makes heavy use of Kotlin's shorthand syntax for functions that
    // can be defined in a single expression.

    // 1. Defines a generic class MutableStack<E> where E is called the "generic type parameter".
    // At use-site, it is assigned to a specific type such as Int by declaring a MutableStack<Int>.
    class MutableStack<E>(vararg items: E) {
        private val elements = items.toMutableList()

        // 2. Inside the generic class, E can be used as a parameter like any other type.
        fun push(element: E) = elements.add(element)

        // 3. You can also use E as a return type.
        fun peek(): E = elements.last()

        fun pop(): E = elements.removeAt(elements.size - 1)

        fun isEmpty() = elements.isEmpty()

        fun size() = elements.size

        override fun toString() = "MutableStack(${elements.joinToString()})"
    }

//----------------------------------------------------------------------------------------------------
//  GENERIC FUNCTIONS - You can also generify functions if their logic is independent of a specific
//  type. For instance, you can write a utility function to create mutable stacks:

    // Note that the compiler can infer the generic type from the parameters of mutableStackOf so
    // that you don't have to write mutableStackOf<Double>(...).
    fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}