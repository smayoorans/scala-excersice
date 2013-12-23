package com.guru.mayoo

object Problem1x {
  def main(args: Array[String]) {
       getMultiples(1000)
  }

  def getMultiples(num : Int){
    println(((1 to num-1).filter(n => n % 3 == 0 || n % 5 == 0)).sum)
  }
}
