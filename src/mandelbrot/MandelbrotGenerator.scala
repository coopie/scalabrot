package mandelbrot

trait MandelbrotGenerator {
  def makeMandelbrotSet() : Seq[Seq[Double]]
  
  val maxIterations = 200
  // Returns a "heat" of how likely a number is to be in the mandelbrot set
  def inMandelbrotSet(x: Complex[Double]) : Double = {
    def inMandelbrotSetHelper(x: Complex[Double], iterations: Int, original: Complex[Double]): Double =
      if (x.l2norm() > 2) 1 - (iterations / maxIterations.toDouble)
      else if (iterations == 0)  1.0
      else inMandelbrotSetHelper((x * x) + original, iterations - 1, original)

    inMandelbrotSetHelper(x, maxIterations, x)
  }

}
