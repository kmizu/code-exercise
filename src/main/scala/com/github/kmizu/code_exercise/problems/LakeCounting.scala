package com.github.kmizu.code_exercise.problems

/**
 * Created by mizushima on 14/02/05.
 */
class LakeCounting {
  sealed abstract class S
  case object W extends S
  case object X extends S

  /**
   *
   * @param garden garden.length <= 100, garden(0).length <= 100
   * @return
   */
  def solve(garden: Array[Array[S]]): Int = {
    val n = garden.length
    val m = garden(0).length
    def dfs(x: Int, y: Int): Unit = {
      garden(x)(y) = X
      for(dx <- -1 to 1; dy <- -1 to 1) {
        val nx = x + dx
        val ny = y + dy
        if(0 <= nx && nx < n && 0 <= ny && ny < m && garden(nx)(ny) == W) {
          dfs(nx, ny)
        }
      }
    }
    var count = 0
    for (i <- 0 until n; j <- 0 until m) {
      if(garden(i)(j) == W) {
        dfs(i, j)
        count += 1
      }
    }
    count
  }
}
