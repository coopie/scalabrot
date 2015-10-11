package mandelbrot

case class Complex[T](re: T, im: T)(implicit n: Numeric[T]) {

  def +(x: Complex[T]) : Complex[T] =
    Complex(n.plus(re, x.re), n.plus(x.im, im))

  def -(x: Complex[T]) : Complex[T] =
    Complex(n.minus(re, x.re), n.minus(im, x.im))

  def *(x: Complex[T]) : Complex[T] =
    Complex(n.minus(n.times(re, x.re), n.times(im, x.im)), n.plus(n.times(re, x.im), n.times(im, x.re)))

  def l2norm() : Double = Math.sqrt(n.toDouble(n.plus(n.times(re, re), n.times(im, im))))

  override def toString() : String = "(" + re + " + " + im + "i)"
}