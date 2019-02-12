package mud
import scala.io.StdIn._

object main {
def main(args: Array[String]): Unit = {
val name = readLine("Welcome to Katy Texas Simulator. What is your name?  ")
println("Welcome, "+name)
var typed = readLine()
do {
  typed = readLine()  
var player = new player()
player.processCommand(typed)
} while (typed!="quit") 
 
}
}

