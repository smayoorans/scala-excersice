package com.guru.mayoo.problem1

/**
 * Created with IntelliJ IDEA.
 * User: mayooran
 * Date: 10/14/13
 * Time: 6:04 PM
 * To change this template use File | Settings | File Templates.
 */
object Problem1 {

  def main (args: Array[String]) {
    getMultiples(1000)
  }

  def getMultiples( num : Int ) {
    var initialValue = 1

    var sum = 0
    while(initialValue < num ){
      if ( initialValue % 3 == 0){
        sum += initialValue ;
        println("Multiples of 3 : "+initialValue)

      }
      if (initialValue % 5 == 0){
        sum += initialValue ;
        println("Multiples of 5 : "+initialValue)
      }
      initialValue += 1

    }

    print("Sum is :"+sum)


  }
}