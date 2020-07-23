package classes

// multiple classes per one file
// class name and file name don't need to match

// normal classes like in java
// one primary constructor
// multiple secondary constructors that call the primary one

// no static but has companion object (can have static properties and methods)

// data classes (java 15+ will have records)
// - destructuring
// - copy

// sealed classes
// - limits to who can extend the class
// - usable in when expression/statement

// interoperability java <-> kotlin

class KotlinPerson constructor(name: String, age: Int) {

    val name: String
    val age: Int

    init {
        println("Primary with $name")
        println("Init block 1")
        this.name = name
        this.age = age;
    }

    init {
        println("Init block 2")
    }

    constructor(): this("Default", 0) {
        println("secondary with $name")
    }

    // without name, in Java it will be called Companion
    companion object StaticThings{
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
    KotlinPerson()
    KotlinPerson(name = "Name", age = 25)
    println(KotlinPerson.constValue)
    KotlinPerson.staticFun()

    // Interoperability with java
    val javaClass = JavaPerson("Name", 25)
    // get/set as a property
    javaClass.age
    javaClass.name
}
