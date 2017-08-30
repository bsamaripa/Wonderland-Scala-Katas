import MagicSquare._
import org.scalatest._

class MagicSquareSpec extends WordSpec with Matchers {
  "magicSquare" when {
    "all the rows, columns, and diagonal add to the same number" in {
      // TODO: Solve this myself
      assert(magicSquare(Seq(1.0, 1.5, 2.0, 2.5, 3.0 , 3.5, 4.0, 4.5, 5.0))
        == Seq(1.5, 4.0, 3.5, 5.0, 3.0, 1.0, 2.5, 2.0, 4.5))
    }
  }
}