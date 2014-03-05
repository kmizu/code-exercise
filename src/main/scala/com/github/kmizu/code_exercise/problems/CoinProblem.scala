package com.github.kmizu.code_exercise.problems

import scala.collection.mutable
import scala.collection.immutable._

/**
 * @author Kota Mizushima
 */
class CoinProblem {
  sealed abstract class Coin(val value: Int)
  case object C001 extends Coin(1)
  case object C005 extends Coin(5)
  case object C010 extends Coin(10)
  case object C050 extends Coin(50)
  case object C100 extends Coin(100)
  case object C500 extends Coin(500)

  private def sum(values: List[(Coin, Int)]): Int = values.foldLeft(0){case (acc,(c, v)) => acc + c.value * v}

  def solveNaive(amount: Int, coins: List[(Coin, Int)]): Option[List[(Coin, Int)]] = {
    def solveMain(a: Int, cs: List[(Coin, Int)]): Option[List[(Coin, Int)]] = cs match {
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
    solveMain(amount, coins.sortBy{case (c, n) => - c.value}).map{_.filter(_._2 > 0)}
  }

  def solveByDP(amount: Int, coins: List[(Coin, Int)]): Option[List[(Coin, Int)]] = {
    val table = mutable.Map[Int, List[(Coin, Int)]]()
    table(0) = Nil
    def solveMain(a: Int, cs: List[(Coin, Int)]): Option[List[(Coin, Int)]] = cs match {
      case Nil =>
        if (a == 0) {
          table(a) = Nil
        }
        table.get(a)
      case ((c, n))::xs =>
        for (m <- Range(n, -1, -1)) {
          table.get(a) match {
            case result@(Some(_)) => return result
            case None =>
              solveMain(a - c.value * m, xs) match {
                case Some(answer) =>
                  val result = (c, m)::answer
                  table(a) = result
                  return Some(result)
                case None =>
              }
          }
        }
        None
    }
    solveMain(amount, coins.sortBy{ case (c, n) => - c.value }).map{_.filter(_._2 > 0)}
  }
}
