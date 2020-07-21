package classes

// multiple classes per one file
// class name and file name don't need to match

// normal classes like in java
// one primary constructor
// multiple secondary constructors that call the primary one

// no static but has companion object (can have static properties and methods)

// data classes (java 15+ will have records)

// sealed classes
// - limits to who can extend the class
// - usable in when expression/statement

// interoperability java <-> kotlin


class KotlinClass constructor(name: String) {

    private val name: String

    init {
        println("Primary with $name")
        println("Init block 1")
        this.name = name
    }

    init {
        println("Init block 2")
    }

    constructor(): this("Default") {
        println("secondary with $name")
    }

    companion object {
        val constValue = "Const"

        fun staticFun() {
            println("I am static $constValue")
        }

    }

}

data class Person(val name: String, val age: Int)

sealed class Language(val name: String)
class Java : Language("Java")
class Python : Language("Python")
class Javascript : Language("Javascript")

fun main() {
    KotlinClass()
    KotlinClass(name = "Name")
    println(KotlinClass.constValue)
    KotlinClass.staticFun()
}
