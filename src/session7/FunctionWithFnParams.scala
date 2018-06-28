package session7

import scala.math._

object FunctionWithFnParams extends App {

  def valueAtOneQuarter(f: (Double) => Double) = f(0.25)


  // test

  val ceilFn = valueAtOneQuarter(ceil _)

  val sqrtFn = valueAtOneQuarter(sqrt _)


  def mulBy(factor: Double) = (x: Double) => factor * x

  val quintuple = mulBy(5)

  quintuple(20) // 100

  val triple: Double => Double = mulBy(3)


  triple(2) // 6

}
