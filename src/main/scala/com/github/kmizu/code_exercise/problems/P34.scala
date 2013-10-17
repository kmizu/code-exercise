package com.github.kmizu.code_exercise.problems

class P34 {
  def solveNaive(k: Int, as: Seq[Int]): Boolean = {
    (1 to as.size).exists{i =>
      as.combinations(i).toSeq.exists{_.sum == k}
    }
  }

  def solve(k: Int, as: Seq[Int]): Boolean = {
    val bs = as.filter{_ <= k}.sorted
    ???
  }
}
