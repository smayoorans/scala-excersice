package com.guru.mayoo.problems

object Problem5 {

  def SumSquareDifference() {
    println((math.pow((1 to 100).sum, 2) - (1 to 100).map(n => n * n).sum).toLong)
  }

  def main(args: Array[String]) {
    println("Sum Square Difference " + SumSquareDifference())
  }
}
