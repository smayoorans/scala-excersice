package com.guru.mayoo

object Problem16 {

  def main(args: Array[String]) {

    println("Sum of the digits of the number 2^1000:" + BigInt(2).pow(1000).toString().map(_.asDigit).sum)
  }
}
