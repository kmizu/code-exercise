package com.github.kmizu.code_exercise.problems

object M1_6Ants {
  type Time = Int
  def solve(L: Int, xs: Seq[Int]): (Time, Time) = {
    require(xs.forall(_ < L), "some ants are out of bar")
    val n = xs.size
    val ys = xs.sorted
    val rests = (ys ++ ys.map{L - _}).sorted
    (rests.take(n).max, rests.reverse.take(n).max)
  }
}
