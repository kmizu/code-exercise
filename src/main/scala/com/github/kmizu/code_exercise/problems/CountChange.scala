package com.github.kmizu.code_exercise.problems

import scala.collection.mutable
import scala.collection.immutable._

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

  private def sum(values: List[(Coin, Int)]): Int = values.foldLeft(0){case (acc,(c, v)) => acc + c.value * v}

  def solve(amount: Int, coins: List[(Coin, Int)]): Option[List[(Coin, Int)]] = {
    def solveNaive(a: Int, cs: List[(Coin, Int)]): Option[List[(Coin, Int)]] = cs match {
      case Nil =>
        if(a == 0) Some(Nil) else None
      case ((c, n))::xs =>
        for (m <- Range(n, -1, -1)) {
          solveNaive(a - c.value * m, xs) match {
            case Some(answer) => return Some((c, m)::answer)
            case _ =>
          }
        }
        None
    }
    solveNaive(amount, coins.sortBy{case (c, n) => - c.value}).map{_.filter(_._2 > 0)}
  }
}
