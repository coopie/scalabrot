import mandelbrot.RecursiveMandelbrotGenerator
import presenters.AsciiPresenter

object Main {
  def main(args: Array[String]): Unit = {
    AsciiPresenter.present(
      RecursiveMandelbrotGenerator.makeMandelbrotSet())
  }
}