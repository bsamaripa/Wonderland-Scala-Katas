import AlphabetCipher._
import org.scalatest._

class AlphabetCipherSpec extends FlatSpec with Matchers {
  "encode" should "encode given a secret keyword" in {
    assert(encode("vigilance","meetmeontuesdayeveningatseven") == "hmkbxebpxpmyllyrxiiqtoltfgzzv")
    assert(encode("scones","meetmebythetree") == "egsgqwtahuiljgs")
  }

  "decode" should "decode an cyrpted message given a secret keyword" in {
    assert(decode("vigilance","hmkbxebpxpmyllyrxiiqtoltfgzzv") == "meetmeontuesdayeveningatseven")
    assert(decode("scones","egsgqwtahuiljgs") == "meetmebythetree")

  }

  "decipher" should "extract the secret keyword given an encrypted message and the original message" in {
    assert(decipher("opkyfipmfmwcvqoklyhxywgeecpvhelzg", "thequickbrownfoxjumpsoveralazydog") == "vigilance")
    assert(decipher("hcqxqqtqljmlzhwiivgbsapaiwcenmyu", "packmyboxwithfivedozenliquorjugs") == "scones")
  }
}
