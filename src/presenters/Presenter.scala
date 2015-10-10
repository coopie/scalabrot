package presenters

trait Presenter {
  def present(grid: List[List[Double]]): Unit
}
