package com.github.kmizu.code_exercise.problems

import org.scalatest.FlatSpec

class PartialSumUnitSpec extends FlatSpec {
  val S = new PartialSummation
  import S._

  "PartialSum#solve" should "return non-empty integer set for the following input" in {
    assertResult(Set(2, 4, 7))(solve(4, Seq(1 ,2, 4, 7), 13))
  }

  "PartialSum#solve" should "return empty integer set for the following input" in {
    assertResult(Set())(solve(4, Seq(1 ,2, 4, 7), 15))
  }
}
