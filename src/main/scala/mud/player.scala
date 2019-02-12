package mud

class player {
  def processCommand(typed:String):Unit = { //parse and act on command
var inventory:List[String] = List() 
var current = Int 
   typed match {
     case "north" => move(0)
     case "south" => move(1)
     case "east" => move(2) 
     case "west" => move(3)
   } 
    }
  
  
  def getfrominventory(itemname:String):Option[Item] = { //pull item out of inventory n return it
    ???
  }
  def addToInventory(item: Item): Unit = { //add item
    ???
  } 
  
  def listinventory():String = { //make a string that prints inventory
    ???
  }
  def move(dir:Int):Unit = { //move player in possible direction
   if (dir==0) {
     println("lmao")
   } else if (dir==1) {
     println("laffo") 
   } else if (dir==2) {
     println("lamao") 
     } else if (dir==3) {
       println("haha")
   }
  }
}
