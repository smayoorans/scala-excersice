package com.guru.mayoo.problems


object Problem10 {

  def isPrime(n : Int) : Boolean = {
      var i = 2
      if (n == 2) return true

      val sqrtN = math.sqrt(n)
      while (i <= sqrtN) {
        if (n % i == 0)  return false
        i = i + 1
      }
      true
  }
  def main(args: Array[String]) {
      var sum = 0
      for(num <- 2 to 2000000){
        if(isPrime(num)) sum = sum + num
      }
      println("Sum of prime numbers is:" + sum)
  }
}
