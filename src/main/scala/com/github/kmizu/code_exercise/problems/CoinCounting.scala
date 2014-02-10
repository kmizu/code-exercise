package com.github.kmizu.code_exercise.problems

/**
 * @author Kota Mizushima
 */
class CoinCounting {
  sealed abstract class Coin
  case object C001
  case object C005
  case object C010
  case object C050
  case object C100
  case object C500
  def solve(contraints: Map[Coin, Int]): (Int, Map[Coin, Int]) = ???
}
