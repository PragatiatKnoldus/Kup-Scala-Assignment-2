package com.knoldus.recursion

class FactTailRecursion {

  def tailRecursiveFactorial(num: Int, acc: Int = 1): Int = {
    if (num < 1) acc
    else tailRecursiveFactorial(num - 1, acc*num)
  }

}
