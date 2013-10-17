package com.github.kmizu.code_exercise.problems

import org.scalatest._

class P34UnitSpec extends FlatSpec {
  val S = new P34
  import S._

  "P34#solveNaive" should "return true for the following input" in {
    assertResult(true)(solveNaive(13, Seq(1, 2, 4, 7)))
  }
}
