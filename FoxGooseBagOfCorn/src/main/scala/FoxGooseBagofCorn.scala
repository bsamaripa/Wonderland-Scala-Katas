object FoxGooseBagofCorn {

  object FoxGooseCornYou extends Enumeration {
    val fox, goose, corn, you = Value
    val empty = ValueSet.empty
  }

  import FoxGooseCornYou._

  val startPos = Seq(
    fox + goose + corn + you /*left bank*/ ,
    empty /*boat*/ ,
    empty /*right bank*/
  )

  def riverCrossingPlan: Seq[Seq[ValueSet]] = Seq(startPos)
}