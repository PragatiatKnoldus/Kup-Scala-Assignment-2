package com.knoldus.recursion

import org.scalatest.flatspec.AnyFlatSpec

class FactRecursionTest extends AnyFlatSpec{

    "A condition" should "be valid as 3 will return 6" in {
      val obj = new FactRecursion()
      assert (6 == obj.recursiveFactorial(3))
    }

    "A condition" should "be valid as 0 will return 1" in {
      val obj = new FactRecursion()
      assert (1 == obj.recursiveFactorial(0))
    }

    "A condition" should "be invalid as 5 will return 720" in {
      val obj = new FactRecursion()
      assert (!(720 == obj.recursiveFactorial(5)))
    }

}
