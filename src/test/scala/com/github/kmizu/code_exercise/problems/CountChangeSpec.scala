package com.github.kmizu.code_exercise.problems

import org.scalatest.FlatSpec

class CountChangeSpec extends FlatSpec {
  val S = new CountChange
  import S._

  "CountChange#solve" should "return the following result" in {
    assertResult(Some(List(C500 -> 1, C050 -> 2, C010 -> 1, C005 -> 2)))(solve(620, List(C001 -> 3, C005 -> 2, C010 -> 1, C050 -> 3, C100 -> 0, C500 -> 2)))
  }
}
