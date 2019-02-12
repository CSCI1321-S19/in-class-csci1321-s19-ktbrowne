package graphicgame

class Enemy extends Entity {
  def dead: Boolean=false 
  private var _x = 1.0
private var _y = 1.0
var level = new Level
 override def width = 30.0
 override def height = 30.0
}

//update(delay:Double)
//stillHere():Boolean
//postCheck():Unit
