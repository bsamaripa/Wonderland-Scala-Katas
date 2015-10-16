import WonderlandNumber._
import org.scalatest._

class WonderlandNumberSpec extends WordSpec with Matchers {

  def hasSameDigits(n1: List[Int], n2: List[Int]): Boolean = n1.toSeq == n2.toSeq

  "A wonderland number" when {
    "must have the following things true about it" in {
      assert(wonderlandNumber() == 42)
    }
  }

}