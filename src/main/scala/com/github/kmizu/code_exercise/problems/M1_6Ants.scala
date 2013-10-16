package com.github.kmizu.code_exercise.problems

object M1_6Ants {
  type Time = Int
  def solve(L: Int, n: Int, xs: Int*): (Time, Time) = {
    xs.foreach(x => require(x < L))
    val ys = xs.sorted
    ys match {
      case y::Nil =>
        val rest = L - y
        val minTime = y min rest
        val maxTime = y max rest
        (minTime, maxTime)
      case y1::y2::Nil =>
        val rest1 = L - y2
        val rest2 = L - y1
        val diff = y2 - y1
        val minTime = y1 min rest1
        val maxTime = diff + (rest1 max rest2)
        (minTime, maxTime)
      case _ =>
        ???
    }
  }
}
