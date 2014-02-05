package com.github.kmizu.code_exercise.problems

import org.scalatest.FlatSpec

class MazeSpec extends FlatSpec {
  val A = new Maze
  import A._

  "Maze#solve" should "return 2 for the following input" in {
    val X = Array[Array[Block]](
      Array(S, ^, G),
      Array(^, ^, ^),
      Array(W, W, W)
    ).transpose

    assertResult(2)(solve(X))
  }

  "Maze#solve" should "return 22 for the following input" in {
    val X = Array[Array[Block]](
      Array(^, S, W, W, W, W, W, W, ^, W),
      Array(^, ^, ^, ^, ^, ^, W, ^, ^, W),
      Array(^, W, ^, W, W, ^, W, W, ^, W),
      Array(^, W, ^, ^, ^, ^, ^, ^, ^, ^),
      Array(W, W, ^, W, W, ^, W, W, W, W),
      Array(^, ^, ^, ^, W, ^, ^, ^, ^, W),
      Array(^, W, W, W, W, W, W, W, ^, W),
      Array(^, ^, ^, ^, W, ^, ^, ^, ^, ^),
      Array(^, W, W, W, W, ^, W, W, W, W),
      Array(^, ^, ^, ^, W, ^, ^, ^, G, W)
    ).transpose

    assertResult(22)(solve(X))
  }

}
