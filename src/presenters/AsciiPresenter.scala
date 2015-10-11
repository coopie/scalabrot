package presenters

object AsciiPresenter extends Presenter{
  override def present(grid: Seq[Seq[Double]]) = println(buildAsciiGrid(grid))

  private def buildAsciiGrid(grid : Seq[Seq[Double]]) : String =
    (grid foldLeft  "") ((str: String, row: Seq[Double]) =>
      str + (row foldLeft  "") (_ + charify(_)) + "\n")

  private def charify(x: Double) =
    if (x == 0) " "
    else (10 - Math.log(x * 1000).toInt) match {
      case 0 => "#"
      case 1 => "@"
      case 2 => "x"
      case 3 => "o"
      case 4 => "*"
      case 5 => "="
      case 6 => "+"
      case 7 => "~"
      case 8 => "-"
      case 9 => "."
      case 10 => " "
      case _ => "" + _
    }
}
