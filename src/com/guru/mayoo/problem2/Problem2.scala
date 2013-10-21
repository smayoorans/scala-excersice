package com.guru.mayoo.problem2

/**
 * Created with IntelliJ IDEA.
 * User: mayooran
 * Date: 10/14/13
 * Time: 6:36 PM
 * To change this template use File | Settings | File Templates.
 */
object Problem2 {

  def main(args: Array[String]) {
    println( "Fib number "+fib(10))
  }
  def fib1( n : Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib1( n-1 ) + fib1( n-2 )
  }
  def fib (count: Int, low: BigInt=0, high: BigInt=1, fibnum: List[BigInt]=Nil): List[BigInt] = {
    if (count == 0) (low :: fibnum).reverse
    else
      fib (count - 1, high, low + high, low :: fibnum)
  }


}
