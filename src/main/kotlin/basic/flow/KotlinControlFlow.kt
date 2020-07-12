package basic.flow

fun main() {
  ifControl("Name")
  stringWhen("Yeah")
  numberWhen(12)
  classesWhen()

}








fun ifControl(name: String) {
//  uppercase = name.length > 5 ? name.toUpperCase() : name;
  // Using if expression (or statement)
  var uppercase1 = if (name.length > 5) name.toUpperCase() else name
  var uppercase2 = if (name.length > 5) {
    name.toUpperCase()
  } else {
    name
  }
  println(uppercase1)
}














fun numberWhen(number: Int) {
  val rangeName = when (number) {
    in 1..10 -> "1-10"
    in 10..20 -> "10-20"
    else -> "20-*"
  }
  println(rangeName)
}









fun stringWhen(word: String) {
  val positiveWords = listOf("Yeah", "Yes", "OK", "Positive")
  val negativeWords = listOf("No", "Nope", "Negative")

  val message = when(word) {
    in positiveWords -> "Positive"
    in negativeWords -> "Negative"
    else -> "Unknown word"
  }
  println(message)
}













fun classesWhen() {
  val people = listOf(WorkerKotlin(), BossKotlin(), CleanerKotlin(), BossKotlin(), DeveloperKotlin())
  people.forEach { person -> processPerson(person) }
}

fun processPerson(person: PersonKotlin) {
  when(person) {
    is BossKotlin, is  WorkerKotlin -> person.increasePay(20)
    is CleanerKotlin -> {
      person.increasePay(10)
      // Compiler inferred the correct type CleanerKotlin
      person.addPrize(200)
    }
    is DeveloperKotlin -> person.increasePay(15)
  }
}

// Use when to return that person also
// Requires exhaustive branching
//fun processPersonWithReturn(person: PersonKotlin): PersonKotlin {
//  return when(person) {
//    is BossKotlin, is  WorkerKotlin -> {
//      person.increasePay(20)
//      person
//    }
//    is CleanerKotlin -> {
//      person.increasePay(10)
//      person.addPrize(200)
//      person
//    }
//    is DeveloperKotlin -> {
//      person.increasePay(15)
//      person
//    }
//  }
//}



open class PersonKotlin(var pay: Int = 0) {
  fun increasePay(percentage: Int) {
    pay *= percentage / 100
  }
}
class WorkerKotlin() : PersonKotlin(1000)
class BossKotlin() : PersonKotlin(2000)
class CleanerKotlin() : PersonKotlin(1300) {
  fun addPrize(amount: Int) {
    pay += amount
  }
}
class DeveloperKotlin() : PersonKotlin(3000)