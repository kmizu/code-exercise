package com.github.kmizu.code_exercise.problems

/**
 * @author Kota Mizushima
 */
class CountChange {
  sealed abstract class Coin
  case object C001 extends Coin
  case object C005 extends Coin
  case object C010 extends Coin
  case object C050 extends Coin
  case object C100 extends Coin
  case object C500 extends Coin
  def solve(a: Int, contraints: Map[Coin, Int]): (Int, Map[Coin, Int]) = (0, Map.empty)
}
