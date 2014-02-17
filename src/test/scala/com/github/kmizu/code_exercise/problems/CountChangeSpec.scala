package com.github.kmizu.code_exercise.problems

import org.scalatest.FlatSpec

class CountChangeSpec extends FlatSpec {
  val S = new CountChange
  import S._

  "CountChange#solve" should "return the following result" in {
    assertResult(Some(List(C500 -> 1, C050 -> 2, C010 -> 1, C005 -> 2)))(solveNaive(620, List(C001 -> 3, C005 -> 2, C010 -> 1, C050 -> 3, C100 -> 0, C500 -> 2)))
  }

  "CountChange#solveByDP" should "return the following result" in {
    assertResult(Some(List(C500 -> 3, C050 -> 1, C010 -> 1)))(solveByDP(1560, List(C001 -> 5, C005 -> 5, C010 -> 5, C050 -> 5, C100 -> 5, C500 -> 4)))
  }
}
