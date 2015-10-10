package mandelbrot

trait MandelbrotGenerator {
  def makeMandelbrotSet() : List[List[Double]]
}
