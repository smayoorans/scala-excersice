package com.guru.mayoo.problems



object Problem7 {

  def Prime(nthPrime : Int) {
    var prime : Int = 0
     if (nthPrime <= 0) println("Wrong Input")
    else if (nthPrime == 1) println("Prime value is " + 2)
    else if (nthPrime == 2) println("Prime value is " + 3)
    else {
       var number : Int = 3
       prime = 2

       while(prime < nthPrime){
         var isFlag = true
         number = number + 2
         val sqrt = Math.sqrt(number).toInt

         for(i <- 3 to sqrt){
           if(number%i==0) isFlag = false
         }
         if(isFlag) prime += 1

       }
       println("Prime value "+number)
     }
  }
  def main(args: Array[String]) {
    println("10001st Prime " + Prime(10001))
  }


}