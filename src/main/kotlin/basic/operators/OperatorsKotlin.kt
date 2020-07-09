package basic.operators

class Book(val pages: MutableList<String> = mutableListOf()) {

  operator fun plus(other: Book): Book {
    val newPages = pages + other.pages
    return Book(pages = newPages.toMutableList())
  }

}


fun main() {
  val book1 = Book(mutableListOf("1", "2", "3"))
  val book2 = Book(mutableListOf("4", "5", "6"))

  // add two books into a new one
  val book3 = book1 + book2

  // collections also have operators
  val names = mutableListOf<String>("Name1", "Name2", "Name3")
  names += "Name4"

}