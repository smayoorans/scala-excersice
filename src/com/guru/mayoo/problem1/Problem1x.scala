package com.guru.mayoo.problem1

/**
 * Created with IntelliJ IDEA.
 * User: mayooran
 * Date: 10/15/13
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
object Problem1x {
  def main(args: Array[String]) {
       getMultiples(1000);
  }

  def getMultiples(num : Int){
    println(((1 to num-1).filter(n => n % 3 == 0 || n % 5 == 0)).sum)
  }
}
