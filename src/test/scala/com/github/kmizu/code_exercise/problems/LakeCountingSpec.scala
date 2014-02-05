package com.github.kmizu.code_exercise.problems

import org.scalatest.FlatSpec

class LakeCountingSpec extends FlatSpec {
  val S = new LakeCounting
  import S._

  "LakeCounting#solve" should "return 1 for the following input" in {
    val G = Array[Array[S]](
      Array(X, X, X),
      Array(X, W, X),
      Array(X, X, X)
    ).transpose

    assertResult(1)(solve(G))
  }

  "LakeCounting#solve" should "return 2 for the following input" in {
    val G = Array[Array[S]](
      Array(X, X, X, X),
      Array(X, W, X, X),
      Array(X, X, X, W)
    ).transpose

    assertResult(2)(solve(G))
  }
  "LakeCounting#solve" should "return 3 for the following input" in {
    val G = Array[Array[S]](
      Array(W, X, X, W),
      Array(X, W, X, X),
      Array(W, X, X, W)
    ).transpose

    assertResult(3)(solve(G))
   }
}
