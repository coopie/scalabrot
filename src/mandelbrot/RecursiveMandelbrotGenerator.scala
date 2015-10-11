package mandelbrot

object RecursiveMandelbrotGenerator extends MandelbrotGenerator {
  override def makeMandelbrotSet() = makeGrid((0,0), 4, 4, 0.02) map (_.map (inMandelbrotSet(_)))


  private def makeGrid(center: (Double, Double),
               width: Double,
               height: Double,
               resolution: Double
                ) : Seq[Seq[Complex[Double]]] = {
    // Start from top left corner of the picture
    val (centerX, centerY) = center
    val startingX = centerX  - width / 2
    val pixelWidth = (width / resolution) toInt

    val startingY = centerY + height / 2
    val pixelHeight = (height / resolution) toInt

    (1 to pixelHeight) map (row =>
      (1 to pixelWidth) map (column =>
        Complex(startingX + (column * resolution), startingY - (row * resolution))))
  }
}

