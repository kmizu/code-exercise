package com.github.kmizu.code_exercise.problems

import scala.collection.mutable

class Maze {
  sealed abstract class Block
  case object W extends Block
  case object ^ extends Block
  case object S extends Block
  case object G extends Block

  /**
   *
   * @param maze maze.length <=  100 && maze(0).length <= 100
   * @return minimal step
   */
  def solve(maze: Array[Array[Block]]): Int =  {
    import Math._
    val queue = mutable.Queue[((Int, Int), Int)]()
    val n = maze.length
    val m = maze(0).length
    val (sx, sy) = (for(x <- 0 until n; y <- 0 until m) yield (x, y)).find{case (x, y) => maze(x)(y) == S}.get
    queue.enqueue(((sx, sy), 0))
    while(!queue.isEmpty) {
      val ((x, y), step) = queue.dequeue()
      for(dx <- -1 to 1; dy <- -1 to 1 if abs(dx) != abs(dy); nx = x + dx; ny = y + dy) {
        if((0 <= nx && nx < n) && (0 <= ny && ny < m)) {
          val v = maze(nx)(ny)
          if (v == G) return step + 1
          if(v == ^) {
            maze(nx)(ny) = W
            queue.enqueue(((nx, ny), step + 1))
          }
        }
      }
    }
    -1
  }
}
