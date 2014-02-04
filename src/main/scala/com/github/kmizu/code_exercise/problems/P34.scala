package com.github.kmizu.code_exercise.problems


class P34 {
  def solveNaive(k: Int, as: Seq[Int]): Boolean = {
    (1 to as.size).exists{i =>
      as.combinations(i).toSeq.exists{_.sum == k}
    }
  }

  def solve(k: Int, as: Seq[Int]): Boolean = {
    val nums = as.sorted.toArray

    val ans = Array.fill(k + 1)(-1)
    ans(0) = 0
    nums.exists{v =>
      for (
        j <- Range(k, -1, -1); x = j + v; if ans(j) != -1 && x <= k && ans(x) == -1
      ) ans(x) = v
      ans(k) != -1
    }
  }
}
