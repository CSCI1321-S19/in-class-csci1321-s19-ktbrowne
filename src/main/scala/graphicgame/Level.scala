package graphicgame
class Level(val maze:Maze,private var _entities:List[Entity]){
println("start level run")

val b = new Player(20, 20, Main.level)
+=(b)


 var entities = _entities
def +=(e:Entity): Unit = { 
       // _entities ::= e
  _entities = e :: _entities
        println(_entities)
}

println(entities)
     

println("end level run")
 def updateAll(delay:Double):Unit = {
  ???
}
 
 }

