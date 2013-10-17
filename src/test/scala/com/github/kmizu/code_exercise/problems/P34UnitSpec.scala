package com.github.kmizu.code_exercise.problems

import org.scalatest._

class P34UnitSpec extends FlatSpec {
  val S = new P34
  import S._

  "P34#solveNaive" should "return true for the following input" in {
    assertResult(true)(solveNaive(13, Seq(1, 2, 4, 7)))
    assertResult(true)(solveNaive(9, Seq(1, 2, 4, 7)))
  }

  "P34#solve" should "return true for the following input" in {
    assertResult(true)(solve(13, Seq(1, 2, 4, 7)))
    assertResult(true)(solve(9, Seq(1, 2, 4, 7)))
  }
}
