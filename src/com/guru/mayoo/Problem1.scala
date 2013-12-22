package com.guru.mayoo.problem1


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