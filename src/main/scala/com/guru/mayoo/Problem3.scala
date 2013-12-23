package com.guru.mayoo

object Problem3 {

  def primeFactors(number : Int){
    var n = number
    var list:List[Int] = Nil
    for ( i <- 2 to n ; if i < n/2){
        while( n % i == 0)  {
          n = n/i
          list = list ::: List(i)
        }
    }
    if (n > 1) {
      list = list ::: List(n)
    }
    println(list.last)
  }

  def main(args: Array[String]) {
    println("Largest prime factors " + primeFactors(13195))
  }
}
