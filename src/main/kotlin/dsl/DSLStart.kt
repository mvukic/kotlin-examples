package dsl

data class Person(var name: String, var age: Int)

// Designed to be called in the context of a Person class
// Person is the receiver
val makeOlderBy = fun Person.(by: Int) {
    this.age += by
}

fun main() {

    val person = Person("Name", 20)
    println(person)
    person.apply {
        makeOlderBy(10)
    }
    println(person)

}