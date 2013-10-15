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

  }

  def fib(n:Int):BigInt = {
    def fibs(n:Int):(BigInt,BigInt) = if (n == 1) (1,0) else {
      val (a,b) = fibs(n/2)
      val p = (2*b+a)*a
      val q = a*a + b*b
      if(n % 2 == 0) (p,q) else (p+q,p)
    }
    fibs(n)._1
  }

}
