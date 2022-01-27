package com.knoldus.recursion

import org.scalatest.flatspec.AnyFlatSpec

class FactTailRecursionTest extends AnyFlatSpec {

  val factTailRec = new FactTailRecursion

  "A condition" should "be correct as 6 will return 720" in {
    assert(720 == factTailRec.tailRecursiveFactorial(6))
  }

  "A condition" should "be incorrect as 8 will not return 5040" in {
    assert(!(5040 == factTailRec.tailRecursiveFactorial(8)))
  }

  "A condition" should "be correct as 0 will return 1" in {
    assert(1 == factTailRec.tailRecursiveFactorial(0))
  }
}