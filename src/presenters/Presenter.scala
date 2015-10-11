package presenters

trait Presenter {
  def present(grid: Seq[Seq[Double]]): Unit
}
