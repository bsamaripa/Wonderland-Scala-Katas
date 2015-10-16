import scala.util.Random

case class Card(suit: String, rank: String)

case class Deck(cards: List[Card])

case class Player(name: String, deck: Deck)

object CardGameWar {
  // Feel free to use these cards or use your own data structure
  val suits = List("Spade", "Club", "Diamond", "Heart")
  val ranks = List("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace")

  // Creates a shuffled deck of cards
  def createDeck: Deck = Deck(new Random shuffle(for {
    suit <- suits
    rank <- ranks
  } yield Card(suit, rank)))

  def playRound(player1: Card, player2: Card): Card = {
    ??? // Winning Card
  }

  def playGame(player1: Player, player2: Player): String = {
    ??? // Winner of Game
  }

}

