package com.github.kmizu.code_exercise.problems

import org.scalatest._
import M1_6._

class M1_6UnitSpec extends FlatSpec {

  "M1_6" should "have answer in some inputs" in {
    assert(solveNaive(2, 3, 4, 5, 10) === 12)
  }

  it should "not have answer otherwise" in {
    assert(solveNaive(4, 5, 10, 20) === 0)
  }
}