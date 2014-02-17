package com.github.kmizu.code_exercise.problems

import scala.collection.mutable

/**
 * @author Kota Mizushima
 */
class CountChange {
  sealed abstract class Coin(val value: Int)
  case object C001 extends Coin(1)
  case object C005 extends Coin(5)
  case object C010 extends Coin(10)
  case object C050 extends Coin(50)
  case object C100 extends Coin(100)
  case object C500 extends Coin(500)

  private def sum(values: Map[Coin, Int]): Int = values.foldLeft(0){case (acc,(c, v)) => acc + c.value * v}

  def solve(amount: Int, constraints: Map[Coin, Int]): (Int, Map[Coin, Int]) = {
    val table = mutable.Map[Int, Int]()
    ???
  }
}
