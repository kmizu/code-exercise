package com.github.kmizu.code_exercise.problems

import org.scalatest._

class M1_6UnitSpec extends FlatSpec {
  val S = new M1_6
  import S._

  "M1_6" should "have answer in some inputs" in {
    assertResult(12)(solveNaive(2, 3, 4, 5, 10))
    assertResult(29)(solveNaive(2, 3, 4, 5, 10, 14))
  }

  it should "not have answer otherwise" in {
    assertResult(0)(solveNaive(4, 5, 10, 20))
    assertResult(0)(solveNaive(0, 1, 15, 25))
  }

  "solveFunctional" should "returns the same value with solveNaive" in {
    assertResult(solveNaive(2, 3, 4, 5, 10))(solveFunctional(2, 3, 4, 5, 10))
    assertResult(solveNaive(4, 5, 10, 20))(solveFunctional(4, 5, 10, 20))
  }

  "solveFunctional" should "returns the same value with solveNaive in the case there are no answer" in {
    assertResult(solveNaive(4, 5, 10, 20))(solveFunctional(4, 5, 10, 20))
    assertResult(solveNaive(0, 1, 15, 25))(solveFunctional(0, 1, 15, 25))
  }

  "solveEfficiently" should "returns the same value with solveNaive" in {
    assertResult(solveNaive(4, 5, 10, 20))(solveEfficiently(4, 5, 10, 20))
    assertResult(solveNaive(2, 3, 4, 5, 10, 14))(solveEfficiently(2, 3, 4, 5, 10, 14))
  }

  "solveEfficiently" should "returns the same value with solveNaive in the case there are no answer" in {
    assertResult(solveNaive(4, 5, 10, 20))(solveEfficiently(4, 5, 10, 20))
    assertResult(solveNaive(0, 1, 15, 25))(solveEfficiently(0, 1, 15, 25))
  }
}