package com.guru.mayoo.problems

object Problem2 {
  def main(args: Array[String]) {

    // method -1
      (for ( i <- 1 to 30
            if  fib(i) % 2 == 0 && fib(i) < 4000000
      ) yield fib(i)).sum

    // method -2
    (1 to 30).filter( n => fib(n) < 4000000).map( n => fib(n) ).filter( m => m % 2 == 0).sum

  }

  def fib( n : Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib( n-1 ) + fib( n-2 )
  }
}




