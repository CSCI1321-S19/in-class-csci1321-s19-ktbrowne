package graphicgame

class Enemy(private var _x:Double, private var _y:Double, var level:Level, private var dead: Boolean, private var dir:Int) extends Entity {
  
 override def width = 30.0
 override def height = 30.0
 
}


//update(delay:Double)
//stillHere():Boolean
//postCheck():Unit
