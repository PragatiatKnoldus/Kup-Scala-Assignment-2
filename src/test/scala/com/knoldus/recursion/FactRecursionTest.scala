package com.knoldus.recursion

import org.scalatest.flatspec.AnyFlatSpec

class FactRecursionTest extends AnyFlatSpec {

  val factRec = new FactRecursion

  "A condition" should "be correct as 3 will return 6" in {
    assert(6 == factRec.recursiveFactorial(3))
  }

  "A condition" should "be correct as 0 will return 1" in {
    assert(1 == factRec.recursiveFactorial(0))
  }

  "A condition" should "be incorrect as 5 will not return 720" in {
    assert(!(720 == factRec.recursiveFactorial(5)))
  }
}