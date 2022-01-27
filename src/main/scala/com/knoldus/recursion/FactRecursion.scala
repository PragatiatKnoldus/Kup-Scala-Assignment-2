package com.knoldus.recursion

class FactRecursion {

  def recursiveFactorial(number: BigInt): BigInt = {
    if (number < 1) 1
    else number * recursiveFactorial(number - 1)
  }
}