package introduction

fun main() {
//----------------------------------------------------------------------------------------------------
//  INHERITANCE - Kotlin fully supports the traditional object-oriented inheritance mechanism.

    // 1. Kotlin classes are final by default. If you want to allow the class inheritance, mark the
    // class with the 'open' modifier.
    open class Dog {
        // 2. Kotlin methods are also final by default. As with the classes, the 'open' modifier
        // allows overriding them.
        open fun sayHello() {
            println("wow wow!")
        }
    }

    // 3. A class inherits a superclass when you specify the ' : SuperclassName()' after its name.
    // The empty parentheses () indicate an invocation of the superclass default constructor.
    class Yorkshire : Dog() {
        // 4. Overriding methods or attributes requires the 'override' modifier.
        override fun sayHello() {
            println("wif wif!")
        }
    }

    val dog: Dog = Yorkshire()
    dog.sayHello()

//----------------------------------------------------------------------------------------------------
//  INHERITANCE WITH PARAMETERIZED CONSTRUCTOR

    open class Tiger(val origin: String) {
        fun sayHello() {
            println("A tiger from $origin says: grrhhh!")
        }
    }

    // 1. If you want to use a parameterized constructor of the superclass when creating a subclass,
    // provide the constructor arguments in the subclass declaration.
    class SiberianTiger : Tiger("Siberia")

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

//----------------------------------------------------------------------------------------------------
//  PASSING CONSTRUCTOR ARGUMENTS TO SUPERCLASSES

    open class Lion(val name: String, val origin: String) {
        fun sayHello() {
            println("$name, the lion from $origin says: graoh!")
        }
    }

    // 1. 'name' in the 'Asiatic' declaration is neither a var nor val: it's a constructor argument,
    // whose value is passed to the 'name' property of the superclass 'Lion'.
    class Asiatic(name: String) : Lion(name = name, origin = "India")

    // 2. Creates an 'Asiatic' instance with the name 'Rufo'. The call invokes the 'Lion' constructor
    // with arguments 'Rufo' and 'India'.
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}