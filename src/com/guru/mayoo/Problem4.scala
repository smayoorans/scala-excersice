package com.guru.mayoo

object Problem4 {

  def SmallestMultiple(){
    var i = 1
    val myList = 1 to 10
        while( i <  100000)  {
          if(myList.map(i % _ == 0).filter(_ == false).isEmpty){
            println(i)
          }
          i = i + 1
        }
  }

  def main(args: Array[String]) {
    println("Smallest Multiple " + SmallestMultiple())
  }
}
