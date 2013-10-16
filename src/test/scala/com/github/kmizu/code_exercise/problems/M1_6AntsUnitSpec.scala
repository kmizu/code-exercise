package com.github.kmizu.code_exercise.problems

import org.scalatest._
import M1_6Ants._

class M1_6AntsUnitSpec extends FlatSpec {

  "M1_6Ants" should "have answer in the following inputs" in {
    assertResult((4, 8))(solve(L = 10, xs = Seq(2, 6, 7)))
  }
}
