package com.github.kmizu.code_exercise.problems

object M1_6 {
  def solveNaive(a: Int*): Int = {
    val n = a.length
    var answer = 0
    for (i <- 0 until n; j <- (i + 1) until n; k <- (j + 1) until n) {
      val len = a(i) + a(j) + a(k)
      val max = a(i) max a(j) max a(k)
      val res = len - max
      if (max < res) answer = answer max len
    }
    answer
  }



}
