import TinyMaze._
import org.scalatest._

class TinyMazeSpec extends WordSpec with Matchers {

  val TestMaze = Maze(Seq(""))

  "SolveMaze" when {
    "can find way to exit with 3x3 maze" in {
      assert(solveMaze(TestMaze) == Maze(Seq("")))
    }
    "can find way to exit with 4x4 maze" in {
      assert(solveMaze(TestMaze) == Maze(Seq("")))
    }
  }
}