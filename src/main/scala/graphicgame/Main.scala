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

val lvl = new Level
 
val player = new Player(20, 20, lvl, true, false, false, false)
  
  stage = new JFXApp.PrimaryStage {
    title = "wtf"
    scene = new Scene(800, 800) {
      fill = Color.Coral

      val canvas = new Canvas(800, 800)
      val gc = canvas.graphicsContext2D
      val renderer = new Renderer2D(gc, 25)

      renderer.render(player.level, 20, 20)

      content = canvas

      //  onKeyPressed = (ke: KeyEvent) => {
      //    ke.code match {
      //      case KeyCode.Up => player.upPressed()
      //    case KeyCode.Down => player.downPressed()
      //      case KeyCode.Left => player.leftPressed()
      //      case KeyCode.Right => player.rightPressed()
      //  case _ =>
      // }
      // }
      //  onKeyReleased = (ke: KeyEvent) => {
      //     ke.code match {
      //       case KeyCode.Up => player.upReleased()
      //    case KeyCode.Down => player.downReleased()
      //      case KeyCode.Left => player.leftReleased()
      //   case KeyCode.Right => player.rightReleased()
      //    case _ =>
      //  }

    }
  }
}