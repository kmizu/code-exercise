package com.github.kmizu.code_exercise.problems

import org.scalatest.FlatSpec

class PartialSumUnitSpec extends FlatSpec {
  val S = new PartialSummation
  import S._

  "CoinCounting#solve" should "should return the following resultnput" in {
    assertResult(Set(2, 4, 7))(solve(Seq(1 ,2, 4, 7), 13))
  }

  "PartialSum#solve" should "return empty integer set for the following input" in {
    assertResult(Set())(solve(Seq(1 ,2, 4, 7), 15))
  }
}
