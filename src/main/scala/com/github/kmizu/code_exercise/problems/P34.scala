package com.github.kmizu.code_exercise.problems

import scala.util.control.Breaks._
import scala.collection.mutable

class P34 {
  def solveNaive(k: Int, as: Seq[Int]): Boolean = {
    (1 to as.size).exists{i =>
      as.combinations(i).toSeq.exists{_.sum == k}
    }
  }

  def solve(k: Int, as: Seq[Int]): Boolean = {
    val nums = as.sorted.toArray

    val ans = Array.ofDim[Int](k + 1)
    ans(0) = 0
    (1 to k).foreach{i => ans(i) = -1}
    breakable {
      for (v <- nums) {
        for {
          j <- Range(k, -1, -1)
          x = j + v
          if ans(j) != -1 && x <= k && ans(x) == -1
        } ans(x) = v
        if (ans(k) != -1) {
          break()
        }

      }
    }

    ans(k) != -1
  }
}
