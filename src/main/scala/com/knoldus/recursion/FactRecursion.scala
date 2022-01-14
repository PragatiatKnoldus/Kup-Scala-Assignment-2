package com.knoldus.recursion

class FactRecursion {

  def recursiveFactorial(num: BigInt): BigInt = {
    if (num < 1) 1
    else num * recursiveFactorial(num - 1)
  }

}

