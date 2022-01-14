package com.knoldus.recursion

import org.scalatest.flatspec.AnyFlatSpec

class FactTailRecursionTest extends AnyFlatSpec{

  "A condition" should "be valid as 6 will return 720" in {
    val obj = new FactTailRecursion()
    assert (720 == obj.tailRecursiveFactorial(6))
  }

  "A condition" should "be invalid as 8 will return 5040" in {
    val obj = new FactTailRecursion()
    assert (!(5040 == obj.tailRecursiveFactorial(8)))
  }

  "A condition" should "be valid as 0 will return 1" in {
    val obj = new FactTailRecursion()
    assert (1 == obj.tailRecursiveFactorial(0))
  }


}
