package presenters

object AsciiPresenter extends Presenter{
  override def present(grid: List[List[Double]]): Unit = println(grid)
}
