package com.github.kmizu.code_exercise.problems

import org.scalatest._
import M1_6._

class M1_6UnitSpec extends FlatSpec {

  "M1_6" should "have answer in some inputs" in {
    assertResult(12)(solveNaive(2, 3, 4, 5, 10))
  }

  it should "not have answer otherwise" in {
    assertResult(0)(solveNaive(4, 5, 10, 20))
  }

  "solveFunctional" should "returns the same value with solveNaive" in {
    assertResult(solveNaive(2, 3, 4, 5, 10))(solveFunctional(2, 3, 4, 5, 10))
    assertResult(solveNaive(4, 5, 10, 20))(solveFunctional(4, 5, 10, 20))
  }
}