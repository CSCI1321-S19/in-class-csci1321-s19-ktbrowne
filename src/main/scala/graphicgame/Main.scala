package graphicgame

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint.Color
import scalafx.scene.control._
import scalafx.scene.shape._
import scalafx.event.ActionEvent
import scalafx.scene.input._
import scalafx.scene.canvas.GraphicsContext
import scalafx.scene.canvas.Canvas
import scalafx.scene.image.Image
import scalafx.scene.image.ImageView

import scalafx.scene.input.KeyEvent
import scalafx.scene.input.KeyCode
/**
 * This is a stub for the graphical game.
 */
object Main extends JFXApp {
   val maze = RandomMaze(3, false, 20, 20, 0.6)
   
 var _entities = List[Entity]()
 var level = new Level(maze, _entities)
val p = new Player(20, 20, level)
   
level.+=(p)

stage = new JFXApp.PrimaryStage {
    title = "wtf"
    scene = new Scene(900, 900) {
   


      val canvas = new Canvas(900, 900)
      val gc = canvas.graphicsContext2D
      val renderer = new Renderer2D(gc, 25)
var lvl = level

     renderer.render(p.level, 20, 20)
      content = canvas
println(level.entities)
      
println("end drawing")

println(level.entities)
   onKeyPressed = (ke: KeyEvent) => {
ke.code match { 
case KeyCode.Up => p.upPressed()
case KeyCode.Down => p.downPressed() 
case _ => 
      }
      }
   

   }   
   

    }
  
  
}
