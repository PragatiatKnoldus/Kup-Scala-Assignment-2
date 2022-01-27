package com.knoldus.recursion

import scala.annotation.tailrec

class FactTailRecursion {

  def tailRecursiveFactorial(element: Int): BigInt = {
    @tailrec
    def innerTailRecursion(number: Int, accumulator: BigInt = 1): BigInt = {
      if (number <= 1) accumulator
      else innerTailRecursion(number - 1, accumulator * number)
    }
    innerTailRecursion(element)
  }
}