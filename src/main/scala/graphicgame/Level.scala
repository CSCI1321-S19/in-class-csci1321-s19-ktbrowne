package graphicgame
class Level {
  val maze = RandomMaze.apply(3,false,20,20,0.6)
  // val maze = RandomMaze(3, false, 20, 20, 0.6)
   //for (r <- -5 until maze.height + 5) {
    // for (c <- -5 until maze.width + 5) {
       // if (maze(r, c) == Wall) print('#') else print(' ')
    // }
    // println()
 
    
    
  

private var _entities = List[Entity]()

def entities(): List[Entity] = { 
        var switch = _entities
        val friend = new Enemy
  if (_entities.length < 5) {
    var _entities = switch :+ friend
    println(_entities)
  }
        println(_entities)
        _entities
}
 
def +=(): List[Entity] = { 
        var switch = _entities
        val friend = new Enemy
  if (_entities.length < 5) {
    var _entities = switch :+ friend
    println(_entities)
  }
        println(_entities)
        _entities
}
 // def +=(e:Entity):Unit = {
 //   ???
 // }
  
 // def updateAll(delay:Double):Unit = 
 // {
  //???
 }

