package interfaces

// fun keyword in from of the interface to indicate SAM conversion
fun interface Command {
  fun run()
}


fun commandRunner(command: Command) {
  command.run()
}

fun main() {

  // without fun
  commandRunner(object : Command {
    override fun run() {
      println("Command run")
    }
  })

  // with fun
  commandRunner { println("Command run") }

}