package graphicgame

object testest extends App {
  val bb = Array.tabulate(100)(_ => "#")
  mm(bb)
  def mm(bb: Array[String]): Unit = {
    val maze = RandomMaze(3, false, 20, 20, 0.6)
    for (r <- -5 until maze.height + 5) {
      for (c <- -5 until maze.width + 5) {
        if (maze(r, c) == Wall) print('#') else print(' ')
      }
      println()
    }
}
}