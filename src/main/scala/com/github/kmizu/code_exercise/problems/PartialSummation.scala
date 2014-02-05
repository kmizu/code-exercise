package com.github.kmizu.code_exercise.problems

import scala.collection.immutable.IndexedSeq

class PartialSummation {
  /**
   *
   * @param a -10^8 <= a^i <= 10^8 && 1 <= n.length <= 20
   * @param k -10^8 <= k <= 10^8
   * @return integer set, summation of its elements is k if there is k, empty set otherwise
   */
  def solve(a: Seq[Int], k: Int): Set[Int] =  {
    val cs: IndexedSeq[(Set[Int], Int)] = (0 to a.length).flatMap{i => a.combinations(i).map{x => (x.toSet[Int], x.sum) }}
    val answers = cs.filter{ case (_, sum) => sum == k}.toList
    answers match {
      case Nil => Set.empty
      case (set, n)::xs => set
    }
  }
}
